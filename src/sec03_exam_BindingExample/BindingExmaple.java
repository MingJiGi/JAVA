package sec03_exam_BindingExample;

public class BindingExmaple {
    public static void main(String[] args) {
        Parent p = new Child(); // 다형성이 적용된 코드
        Child c = new Child(); // 다형성 미적용 코드
//
//        멤버변수는 각 인스턴스에 있는 값을 출력함.
//        멤버메서드의 경우 오버라이딩된 자손클래스의 메서드를 둘 다 호출함에 주의
//                물론, 자손클래스에서 아무것도 정의되지 않앗다면, 조상클래스의 멤버변수와
//                멤버메서드가 호출


        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}
