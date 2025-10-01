package sec02_hashcode;

import java.util.ArrayList;
import java.util.List;

public class KeyExample {

    public static void main(String[] args) {

        //기본적으로 10개의 방이 할당된다.
        List<Key> list = new ArrayList<>();

        list.add(new Key(10));
        list.add(new Key(10));

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

















    }
}
