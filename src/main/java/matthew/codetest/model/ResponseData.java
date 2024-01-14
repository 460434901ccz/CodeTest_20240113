package matthew.codetest.model;

public class ResponseData {
    private RequestData requestData;
    private String outputString;
    private String errorMsg;

    public ResponseData() {
    }

    public ResponseData(RequestData requestData) {
        this.requestData = requestData;
    }

    public RequestData getRequestData() {
        return requestData;
    }

    public void setRequestData(RequestData requestData) {
        this.requestData = requestData;
    }

    public String getOutputString() {
        return outputString;
    }

    public void setOutputString(String outputString) {
        this.outputString = outputString;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "requestData=" + requestData +
                ", outputString='" + outputString + '\'' +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
