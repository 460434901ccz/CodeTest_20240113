package matthew.codetest.handler;

import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;

public interface IHandler {
    String TASK_TYPE_01 = "TASK_01";
    String TASK_TYPE_02 = "TASK_02";

    String ERROR_MSG_NULL_OR_EMPTY_INPUT = "ERROR_MSG_NULL_OR_EMPTY_INPUT";
    String ERROR_MSG_ILLEGAL_CHARACTER_EXISTS = "ERROR_MSG_ILLEGAL_CHARACTER_EXISTS";

    String REGEX_STRING = "([a-z])\\1{2,}";

    default ResponseData handle(RequestData requestData) {
        return new ResponseData();
    }
}
