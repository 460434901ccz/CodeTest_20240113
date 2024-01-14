package matthew.codetest.listener;

import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Warning: A synchronized lock is in System.out.println method. It affects performance if it were be called concurrently
 * It should only be used in a development environment.
 *
 * @author Matthew Cai
 */
public class ConsoleLogListener implements IListener {
    private static final Logger logger = Logger.getLogger(ConsoleLogListener.class.getName());

    @Override
    public void preHandle(RequestData requestData) {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(this.getClass().getName() + " preHandle begin");
        }

        System.out.println("Original input string: " + requestData.getOriginalInputString());
        System.out.println("Pre processed string: " + requestData.getPreProcessedString());


        if (logger.isLoggable(Level.FINE)) {
            logger.fine(this.getClass().getName() + " preHandle end");
        }
    }

    @Override
    public void postHandle(RequestData requestData, ResponseData responseData) {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(this.getClass().getName() + " postHandle begin");
        }

        if (responseData.getErrorMsg() == null) {
            System.out.println("Result output string:" + responseData.getOutputString());
        } else {
            System.out.println("Error msg:" + responseData.getErrorMsg());
        }

        if (logger.isLoggable(Level.FINE)) {
            logger.fine(this.getClass().getName() + " postHandle end");
        }
    }
}
