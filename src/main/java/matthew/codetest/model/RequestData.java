package matthew.codetest.model;

/**
 * @author Matthew Cai
 */
public class RequestData {
    private int taskId;
    private String taskType;
    private String originalInputString;
    private String preProcessedString;

    public RequestData() {
    }

    public RequestData(int taskId, String taskType, String originalInputString) {
        this.taskId = taskId;
        this.taskType = taskType;
        this.originalInputString = originalInputString;
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

    public String getOriginalInputString() {
        return originalInputString;
    }

    public void setOriginalInputString(String originalInputString) {
        this.originalInputString = originalInputString;
    }

    public String getPreProcessedString() {
        return preProcessedString;
    }

    public void setPreProcessedString(String preProcessedString) {
        this.preProcessedString = preProcessedString;
    }

    @Override
    public String toString() {
        return "RequestData{" +
                "taskId=" + taskId +
                ", taskType='" + taskType + '\'' +
                ", originalInputString='" + originalInputString + '\'' +
                ", preProcessedData='" + preProcessedString + '\'' +
                '}';
    }
}
