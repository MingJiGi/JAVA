package sec01_exam_wrapper;

import java.util.Vector;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {

        Vector<Integer>  v = new Vector<>();
        //박싱(Boxing) - 기본형 타입의 변수를 클래스로 포장하는 것
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("100");
        Integer obj3 = Integer.valueOf(100);
        Integer obj4 = 100; // 컴파일시에 new Integer(100); 으로 바뀐다.
        v.add(obj1);
        //기억할 사항은 obj1~4까지는 변수가 아니라, 클래스 라는것이다.
        System.out.println("박싱후");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);

        //언박싱 - 클래스 타입을 기본형  타입으로 바꾸는 것
        int value1 = obj1.intValue();
        int value2 = obj2;
        int value3 = obj3.intValue();
        int value4 = obj4;
        v.add(new Integer(100));
        for (int value : v) System.out.println("벡터에 들어 있는 값 : " + value);

        System.out.println("언박싱 후");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);




    }
}
