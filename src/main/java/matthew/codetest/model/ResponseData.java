package matthew.codetest.model;

public class ResponseData {
    private int taskId;
    private String taskType;
    private String outputString;

    public ResponseData() {
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

    public String getOutputString() {
        return outputString;
    }

    public void setOutputString(String outputString) {
        this.outputString = outputString;
    }


    @Override
    public String toString() {
        return "ResponseData{" +
                "taskId=" + taskId +
                ", taskType='" + taskType + '\'' +
                ", outputString='" + outputString + '\'' +
                '}';
    }
}
