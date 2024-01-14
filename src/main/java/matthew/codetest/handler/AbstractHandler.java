package matthew.codetest.handler;

import matthew.codetest.listener.IListener;
import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public abstract class AbstractHandler implements IHandler {

    private Pattern pattern = Pattern.compile(REGEX_STRING);

    private List<IListener> handleListeners = new ArrayList<>();

    @Override
    public ResponseData handle(RequestData requestData) {
        handleListeners.stream().forEach(listener -> listener.preHandle(requestData));

        ResponseData responseData;

        String errorMsg = validate(requestData);
        if (errorMsg == null) {
            responseData = handler0(requestData);
        } else {
            responseData = new ResponseData(requestData);
            responseData.setErrorMsg(errorMsg);
        }

        handleListeners.stream().forEach(listener -> listener.postHandle(requestData, responseData));

        return responseData;
    }

    abstract ResponseData handler0(RequestData requestData);

    private String validate(RequestData requestData) {
        if (requestData == null
                || requestData.getOriginalInputString() == null
                || requestData.getOriginalInputString().isBlank()) {
            return IHandler.ERROR_MSG_NULL_OR_EMPTY_INPUT;
        } else if (!requestData.getOriginalInputString().matches("[a-z]+")) {
            return IHandler.ERROR_MSG_ILLEGAL_CHARACTER_EXISTS;
        }
        return null;
    }

    Pattern getPattern() {
        return pattern;
    }

    public void addHandleListeners(IListener listener) {
        this.handleListeners.add(listener);
    }
}
