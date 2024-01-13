package matthew.codetest.handler;

import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;

import java.util.logging.Logger;

public abstract class AbstractHandler implements IHandler {

    private static final Logger logger = Logger.getLogger(AbstractHandler.class.getName());

    @Override
    public abstract ResponseData handle(RequestData requestData);

}
