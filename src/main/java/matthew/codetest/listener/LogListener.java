package matthew.codetest.listener;

import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogListener implements IListener {
    private static final Logger logger = Logger.getLogger(LogListener.class.getName());

    @Override
    public void preHandle(RequestData requestData) {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(this.getClass().getName() + " preHandle begin");
        }


        if (logger.isLoggable(Level.INFO)) {
            logger.info("RequestDate:" + requestData);
        }


        if (logger.isLoggable(Level.FINE)) {
            logger.fine(this.getClass().getName() + " preHandle end");
        }
    }

    @Override
    public void postHandle(RequestData requestData, ResponseData responseData) {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(this.getClass().getName() + " postHandle begin");
        }


        if (logger.isLoggable(Level.INFO)) {
            logger.info("ResponseData:" + responseData);
        }


        if (logger.isLoggable(Level.FINE)) {
            logger.fine(this.getClass().getName() + " postHandle end");
        }
    }
}
