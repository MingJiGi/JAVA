package sec00_exam_InterfaceExample;

public class Example {

    public static void main(String[] args) {

        Member member = new Member();
        member.method();
        member.method1();

//
//        인터페이스를 구현 했다는 것은 구현 클래스로써 일종의 조상이므로
//                아래와 같이 인터페이스 필드의 다형성이 적용된다.
        A a = new Member(); // 인터페이스 필드의 다형성
        a.method(); // 근본을 벗어나지 못하기 때문에 메서드가 하나만 뜬다
//
//        a의 근본은 A라는 인터페이스이다. 하지만 A인터페이스에서 method1() 존재하지 않는다.
//        하여 다형성에서 배웟듯이 근본은 절대 벗어나지 못한다.
//                a.method1()





    }
}
