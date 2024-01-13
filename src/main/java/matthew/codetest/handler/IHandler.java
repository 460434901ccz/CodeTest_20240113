package matthew.codetest.handler;

import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;

public interface IHandler {
    default ResponseData handle(RequestData requestData) {
        return new ResponseData();
    }
}
