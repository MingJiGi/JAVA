package DataProcessingQueue;

public class OrderRecord extends DataRecord{

    double totalAmount;

    public OrderRecord(int recordId, String timestamp, double tatalAmount) {
        super(recordId, timestamp);
        this.totalAmount = tatalAmount;
    }

    @Override
    String getDetails() {
        return "현재의 정보 : " + this.totalAmount + this.recordId + this.isProcessed+
                this.timestamp;
    }
}
