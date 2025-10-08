package DataProcessingQueue;

public class SystemMain {

    public static void main(String[] args) {

        Processable[] arr = new Processable[]{new CustomerRecord(10,"A","홍길동"),
                new OrderRecord(123,"asd",10.1)};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getSummary());
        }


        ProcesorQueue<DataRecord> customerRecord = new ProcesorQueue<>();

        customerRecord.addRecord(new OrderRecord(10,"X",10.2));



    }
}
