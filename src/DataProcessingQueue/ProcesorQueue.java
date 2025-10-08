package DataProcessingQueue;

import java.util.ArrayList;
import java.util.List;

public class ProcesorQueue <T extends DataRecord>{
    List<T> queue = new ArrayList<>();



    void addRecord(T record){
        queue.add(record);
    }

    void processAll(){
        for (T t : queue){
        t.process();
        }
    }










}
