package sec03_array_sort;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {

    public static void main(String[] args) {
        //기본형 타입이나 String클래스 타입은 Arrays.sort()하면 기본적으로 오름차순 정렬이 이루어진다
        Integer[] scores = new Integer[]{55, -100, 8, 8, 23};
        //int[] scores = new int[]{55, -100, 8, 8, 23};
        String[] str = new String[]{"김갑수","권민석","신은형","김연아","신효재"};
        Arrays.sort(scores); // 오름차순
//        Arrays.sort(scores, Collections.reverseOrder()); // 내림차순
        System.out.println("기본형 타입 소팅 후 : " + Arrays.toString(scores));
        Arrays.sort(str); // 오름차순
//        Arrays.sort(str, Collections.reverseOrder());
        System.out.println("기본형 타입 소팅 후 : " + Arrays.toString(str));


        Member m1 = new Member("신효재");
        Member m2 = new Member("권민석");
        Member m3 = new Member("도현호");

        Member[] members = {m1,m2,m3};
        Arrays.sort(members); // 오름 차순
//        Arrays.sort(members, Collections.reverseOrder()); // 내림 차순

        System.out.println("member Sort 후 : " + Arrays.toString(members));

        //sort을 먼저 하지 않고. binarySearch()를 사용하면 예외가 발생한다.
        int idx = Arrays.binarySearch(members, m1);
        System.out.println("m1인스턴스가 있는 인덱스 : " + idx + "\t 찾는 객체 : " + members[idx]);


    }
}
