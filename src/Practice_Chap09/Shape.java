package Practice_Chap09;

// 조상클래스(부모클래스) 멤버갯수 : 2개
public class Shape {
    String color = "black";

    public Shape(){
        System.out.println("Shape 기본생성자 호출");
    }

    public void draw(){
        System.out.println("[color = " + this.color +"]");
    }
}
