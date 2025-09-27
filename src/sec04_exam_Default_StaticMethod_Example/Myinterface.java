package sec04_exam_Default_StaticMethod_Example;

public interface Myinterface {
    // JDK 1.8부터 아래 2개의 메서드가 인터페이스 멤버로 추가되었다.

    // 1. default 메서드는 기본적으로 public접근제한을 갖는다.
    // 블럭(구현부가 존재하는 메서드)
    default void method1(){
        System.out.println("인터페이스에 선언된 디폴트 메서드1 호출");
    }
    default void method2(){
        System.out.println("인터페이스에 선언된 디폴트 메서드2 호출");
    }

    //2. 정적메서드
    static void staticMethod(){
        System.out.println("인터페이스에 선언된 정적 메서드 호출");
    }


}
