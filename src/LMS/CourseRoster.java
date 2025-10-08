package LMS;

import java.util.ArrayList;
import java.util.List;

public class CourseRoster <T extends Student>{
    List<T> list = new ArrayList<>();

    public void addStudent(T student){
        list.add(student);
    }

    public void printAllInfo(){
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }
}
