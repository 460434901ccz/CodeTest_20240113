package matthew.codetest.handler;

import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;

import java.util.regex.Pattern;

public abstract class AbstractHandler implements IHandler {

    private Pattern pattern = Pattern.compile(REGEX_STRING);


    @Override
    public ResponseData handle(RequestData requestData) {
        ResponseData responseData;

        String errorMsg = validate(requestData);
        if (errorMsg == null) {
            responseData = handler0(requestData);
        } else {
            responseData = new ResponseData(requestData);
            responseData.setErrorMsg(errorMsg);
        }

        return responseData;
    }

    abstract ResponseData handler0(RequestData requestData);

    private String validate(RequestData requestData) {
        if (requestData == null
                || requestData.getInputString() == null
                || requestData.getInputString().isBlank()) {
            return IHandler.ERROR_MSG_NULL_OR_EMPTY_INPUT;
        } else if (!requestData.getInputString().matches("[a-z]+")) {
            return IHandler.ERROR_MSG_ILLEGAL_CHARACTER_EXISTS;
        }
        return null;
    }

    Pattern getPattern() {
        return pattern;
    }

}
