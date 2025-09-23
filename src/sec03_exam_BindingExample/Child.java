package sec03_exam_BindingExample;

public class Child extends  Parent{
    int x = 200;
//    조상클래스 method가 오버라이딩된 부분
//            메서드의 경우 자손에서 조상의 메서드를 오버라이딩을 하게 되면
//            참조된 인스턴스의 메서드가 호출됨을 명심


    @Override
    public void method() {
        super.method();
        System.out.println("Parent x : " + super.x); // 100
        System.out.println("Child x : " + x); // 200
        System.out.println("Child x : " + this.x); // 200
        System.out.println("Child Method"); // 그대로 출력
    }
}
