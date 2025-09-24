package OsanChapter05;

public class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y); // super 클래스에 매개변수가 있는 생성자에 5와 6을 넘겨준다
        this.color = color; // colorPrint 만 가지고 있는 필드에 color값을 초기화 시켜준다
    }



    //부모의 메서드인 showpoint를 재정의하여 아래와 같이 변경
    @Override
    public void showPoint() {
        System.out.print(color);
        super.showPoint();
    }
}
