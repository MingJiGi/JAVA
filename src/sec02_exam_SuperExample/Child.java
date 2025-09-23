package sec02_exam_SuperExample;

public class Child extends Parent{
    int x = 100;

    public void method(){
        System.out.println("현재 인스턴스 x = " + x); // 100
        System.out.println("자손클래스 : this.x = " + this.x ); // 100
        System.out.println("조상클래스 super.x = " + super.x); // 10

    }
    @Override
    public String toString(){
        return "Hello";
    }
}
