package matthew.codetest.model;

public class RequestData {
    private int taskId;
    private String taskType;
    private String inputString;

    public RequestData() {
    }

    public RequestData(int taskId, String taskType, String inputString) {
        this.taskId = taskId;
        this.taskType = taskType;
        this.inputString = inputString;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String toString() {
        return "RequestData{" +
                "taskId=" + taskId +
                ", taskType='" + taskType + '\'' +
                ", inputString='" + inputString + '\'' +
                '}';
    }
}
