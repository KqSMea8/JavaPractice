package mail;


public class JobResult {

    private String jobName;

    private boolean correct = false;

    private String diffRows;

    private String error;

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public String getDiffRows() {
        return diffRows;
    }

    public void setDiffRows(String diffRows) {
        this.diffRows = diffRows;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "JobResult{" +
                "jobName='" + jobName + '\'' +
                ", correct=" + correct +
                ", diffRows='" + diffRows + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
