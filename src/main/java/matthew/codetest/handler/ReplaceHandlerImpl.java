package matthew.codetest.handler;

import matthew.codetest.listener.LogListener;
import matthew.codetest.listener.RequestStringTrimListener;
import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;


/*
#Stage 2 - advanced requirement
Instead of removing the consecutively identical characters, replace them with a
single character that comes before it alphabetically.
Example:
ccc -> b
bbb -> a
Input: abcccbad
Output:
-> abbbad, ccc is replaced by b
-> aaad, bbb is replaced by a
-> d
 */
public class ReplaceHandlerImpl extends AbstractHandler {

    private static final Logger logger = Logger.getLogger(ReplaceHandlerImpl.class.getName());

    // the volatile modifier is used to prevent instruction reordering
    private volatile static ReplaceHandlerImpl handler;

    private ReplaceHandlerImpl() {
    }

    public static ReplaceHandlerImpl getInstance() {
        if (handler == null) {
            synchronized (ReplaceHandlerImpl.class) {
                if (handler == null) {
                    ReplaceHandlerImpl handlerTmp = new ReplaceHandlerImpl();
                    handlerTmp.addHandleListeners(new LogListener());
                    handlerTmp.addHandleListeners(new RequestStringTrimListener());

                    handler = handlerTmp;

                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("ReplaceHandlerImpl generate instance");
                    }
                }
            }
        }
        return handler;
    }

    @Override
    ResponseData handler0(RequestData requestData) {
        ResponseData responseData = new ResponseData(requestData);

        if (logger.isLoggable(Level.INFO)) {
            logger.info(requestData.getPreProcessedString());
        }
        String result = replace(requestData.getOriginalInputString());

        responseData.setOutputString(result);
        return responseData;
    }

    private String replace(String input) {
        Matcher matcher = getPattern().matcher(input);
        String result = input;

        //exit recursion
        if (!matcher.find()) return result;
        //exit recursion

        matcher.reset();
        while (matcher.find()) {

            String subString = matcher.group();

            String beforeCString = "";
            char c = subString.charAt(0);
            if (c != 'a') {
                beforeCString = new String(new char[]{(char) ((int) c - 1)});
            }

            result = result.substring(0, result.indexOf(subString)) + beforeCString
                    + result.substring(result.indexOf(subString) + subString.length());
        }

        if (logger.isLoggable(Level.INFO)) {
            logger.info("Process log: " + result);
        }

        return replace(result);
    }


}
