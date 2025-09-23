package Practice_Chap09;

//세 개의 점을 가지고 있는 삼각형
public class Triangle extends Shape{
    Point[] p; // Point 배열 선언

    public Triangle(){
        this(new Point(0, 0), new Point(0, 100), new Point(100, 0));
        System.out.println("Triangle 기본생성자 호출");
    }

    public Triangle(Point p1, Point p2, Point p3) {
        super();
        System.out.println("Triangle 매개변수 3개짜리 생성자 호출");
        this.p = new Point[] {p1, p2, p3};
    }
    //Point [] 타입의 주소를 받는 생성자
    public Triangle(Point[] p){
        System.out.println("매개변수 Point[] 생성자 호출");
        this.p = p;

    }


    @Override
    public void draw() {
        for (int i = 0; i <p.length; i++) {
            System.out.println("[p"+(i+1)+"] : " + this.p[i].toString());
        }
    }
}
