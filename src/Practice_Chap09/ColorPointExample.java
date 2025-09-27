package Practice_Chap09;

public class ColorPointExample {
    public static void main(String[] args) {
        // 조상인스턴스와 자손의 인스턴스가 제대로 초기화 되었는지 확인하는 코드
        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("레드");
        cp.showColorPoint();



    }
}
