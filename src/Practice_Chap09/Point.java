package Practice_Chap09;

public class Point {
    int x; // 멤버변수 x
    int y; // 멤버변수 y



    public Point(){ //기본 생성자 Point 선언
        this(0,0); // 값을 매개변수가 있는 생성자에게 넘겨줌
        System.out.println("Point 클래스의 기본 생성자 호출");
    }
    // 매개변수 생성자(매개변수가 있는 생성자가 클래스내에 존재하면 기본생성자를
    // 컴파일러가 따로 추가해주지 않는다.)

    public Point(int x, int y){ // 매개변수가 있는 생성자
        System.out.println("Point클래스의 매개변수 있는 생성자 호출");
        this.x = x; // 멤버변수 x에 x를 대입하여 초기화
        this.y = y; // 멤버변수 y에 y를 대입하여 초기화
    }




    @Override
    public String toString(){
        return "(" + this.x +","+this.y+")";
    }
}
