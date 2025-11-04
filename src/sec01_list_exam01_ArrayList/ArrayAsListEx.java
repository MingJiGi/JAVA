package sec01_list_exam01_ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListEx {
    public static void main(String[] args) {

        //asList()는 컬렉션이 아니라 배열형식으로 된 컬렉션을 리턴한다.
        List<String> list1 = Arrays.asList("홍길동","이준호","김기리");
//      아래와 같이 객체 추가, 삭제를 하면 예외가 발생한다.
//        list1.add("aaa");
//        list1.remove("홍길동");

        System.out.println(list1.toString());

        System.out.println();

        List<Integer> list2 = Arrays.asList(100,200,300);
        //아래 코드는 List컬렉션 타입을 배열로 다시 변환시키고 있다.
        Integer[] arr = (Integer[]) list2.toArray();

        for (Integer a : arr){
            System.out.println(a);
        }
    }
}
