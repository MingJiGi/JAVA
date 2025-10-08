package DataProcessingQueue;

public abstract class DataRecord implements Processable{

    protected int recordId;
    protected String timestamp;
    protected boolean isProcessed;

    abstract String getDetails();

    public DataRecord(int recordId, String timestamp) {
        this.recordId = recordId;
        this.timestamp = timestamp;
        this.isProcessed = false;
    }


    @Override
    public String getSummary() {
        return "현재의 정보 : " + this.recordId + this.timestamp + this.isProcessed;
    }

    @Override
    public boolean process() {
        this.isProcessed = true;

        return true;
    }
}
