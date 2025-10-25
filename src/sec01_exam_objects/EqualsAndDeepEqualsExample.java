package sec01_exam_objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
    static class A{}

    public static void main(String[] args) {






        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.equals(a2));
        System.out.println(Objects.equals(a1,a2));





        Integer o1 = new Integer(1000);
        Integer o2 = 1000; // 자동박싱
        //모든 포장객체 Wrapper클래스 equals() 가 오버라이딩 되어 있다.
        System.out.println(o1.equals(o2));
        //위와 같이 기준이 되는 객체와 비교가 되는 객체를 분리해놓은 ㅎ ㅕㅇ태는
        // 또 다른 것과 비교를 할려면 계속 기준 바꿀필요가 존재한다.)
        System.out.println(Objects.equals(o1,o2));


        Integer[] arr1 = {1,2}; // 자동 박싱
        Integer[] arr2 = {new Integer(1), new Integer(2)};

        //Objects.equals()는 매개변수가 참조타입이 들어오면 주소비교(얕은 비교)
        System.out.println(Objects.equals(arr1,arr2));

        //deepEquals는 주소가아닌 실제값을 비교해서 같은지를 비교후 true false 반환
        System.out.println(Objects.deepEquals(arr1, arr2));
        System.out.println(Arrays.deepEquals(arr1,arr2));




    }
}
