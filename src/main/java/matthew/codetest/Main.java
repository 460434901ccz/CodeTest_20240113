package matthew.codetest;

import matthew.codetest.handler.IHandler;
import matthew.codetest.handler.RemoveHandlerImpl;
import matthew.codetest.handler.ReplaceHandlerImpl;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        logger.info("hello");

        IHandler handler = new RemoveHandlerImpl();
        handler.handle(null);

        handler = new ReplaceHandlerImpl();
        handler.handle(null);

    }

}
