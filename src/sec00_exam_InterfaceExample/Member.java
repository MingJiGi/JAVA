package sec00_exam_InterfaceExample;

//A인터페이스를 구현한 Member 클래스
public class Member implements A {





    @Override
    public void method() {
        System.out.println("인터페이스 A를 구현한 클래스 Member의 Method() 호출됨");
    }

    //Meber만의 고유의 메서드
    public void  method1() {
        System.out.println("Meber 클래스 만의 있는 Method1() 호출됨");
    }
}
