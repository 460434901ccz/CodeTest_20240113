package matthew.codetest.listener;

import matthew.codetest.model.RequestData;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Delete whitespace characters on both sides of the request string
 */
public class RequestStringTrimListener implements IListener {
    private static final Logger logger = Logger.getLogger(RequestStringTrimListener.class.getName());

    @Override
    public void preHandle(RequestData requestData) {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(this.getClass().getName() + " preHandle begin");
        }

        if (requestData == null || requestData.getOriginalInputString() == null) return;

        requestData.setPreProcessedString(requestData.getOriginalInputString().strip());

        if (logger.isLoggable(Level.FINE)) {
            logger.fine(this.getClass().getName() + " preHandle end");
        }
    }


}
