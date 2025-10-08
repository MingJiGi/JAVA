package sec02_hashcode;

import java.util.*;

public class KeyExample {

    public static void main(String[] args) {

//        기본적으로 10개의 방이 할당된다.
        List<Key> list = new ArrayList<>();

        list.add(new Key(10));
        list.add(new Key(10));
        System.out.println(list.get(0).equals(list.get(1)));

//        Set<Key> set = new HashSet<>();
//        set.add(new Key(20));
//        set.add(new Key(20));

//        HashMap은 어떠한 Key로 데이터를 저장하는 컬렉션
        HashMap<Key, String> hashMap = new HashMap<>();
        hashMap.put(new Key(2), "홍길동");
        hashMap.put(new Key(3), "이수호");

        //HahMap, HashSet, HashTable, LinkedHashSet(컬렉션(List계열, TreeSet제외)은
        // equals를 호출하기 전에 hashcode()를 먼저 호출한다.
        // 그렇기 때문에, new 연산자를 통해 Key인스턴스를 만들었으므로, 각기 힙에 저장되는 번지가
        // 달라 원하는 값을 주지 아니한다.
        // 원하는 값을 얻기 위해서는 Object클래스의 hashcode()를 재정의를 해서 값이
        // 같을때 1차 논리적 동등을 인정한다.
        // 그리고 equals()를 재정의하여 그 값을 같게 함으로써 동등객체가 되어 원하는 값이 나온다.

        String value1 =  hashMap.get(new Key(2));
        String value2 =  hashMap.get(new Key(3));
        System.out.println(value1);
//        System.out.println(value1.hashCode() + "," + value2.hashCode());
        Set<Key> set = new LinkedHashSet<>();
        set.add(new Key(10));
        set.add(new Key(11));
        set.add(new Key(12));


        //반복자
        Iterator<Key> iterator = set.iterator();
        while (iterator.hasNext()){
            Key key = iterator.next();
            System.out.println(key.hashCode());
        }

        //향상된 for문
        for (Key key : set){
            System.out.println(key.hashCode());
        }
    }
}
