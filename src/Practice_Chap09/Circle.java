package Practice_Chap09;

public class Circle extends Shape{
    Point center; // 포함관계
    int r;

    public Circle(){
        //Circle(Point center, int r)호출
        //호출하기 전에 Pint클래스의 생성자 중 public Point(int x, int y)을
        // 호출하고 Circle(Point center, int r)호출 하면서 지역변수 center에게
        // Point의 주소를 넘겨준다)
        this(new Point(0, 0),100);
        System.out.println("Circle 기본생성자 호출");


    }

    public Circle(Point center, int r) {
        super();
        this.center = center;
        this.r = r;
    }


    // 조상클래스의 멤버메서드인 draw() 를 오버라이딩 (재정의) 함
    // 원을 그리는 대신에 원의 정보를 출력하도록 했다.
    // (오버라이딩 : 선언부가 무조건 같고, 구현부만 다르게 구현함)

    @Override
    public void draw() {
        System.out.println("색갈 : "+ this.color);
        System.out.println("원점 : (X : " + this.center.x + ", y :" + this.center.y+")");
        System.out.println("반지름 : " + this.r);
    }
}
