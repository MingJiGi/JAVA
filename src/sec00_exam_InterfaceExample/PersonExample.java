package sec00_exam_InterfaceExample;

public class PersonExample {
    public static void main(String[] args) {
        A a = new Person() {};
        Person p = new Person() {};
        a.method();
        p.method();

        A a1 = new Member(); // 멤버변수의 다형성이 적용
        a1.method();
    }

}
