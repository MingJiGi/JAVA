package DataProcessingQueue;

public class CustomerRecord extends DataRecord{
    String customerName;

    public CustomerRecord(int recordId, String timestamp, String customerName) {
        super(recordId, timestamp);
        this.customerName = customerName;
    }


    @Override
    String getDetails() {
        return "현재의 정보 : " + this.customerName + this.recordId + this.isProcessed+
                this.timestamp;
    }
}
