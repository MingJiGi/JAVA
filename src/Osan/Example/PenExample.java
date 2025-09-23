package Osan.Example;

public class PenExample {
    public static void main(String[] args) {
        FountainPen f = new FountainPen(10,"Red");
        SharpPencil s = new SharpPencil(20 ,30);

        f.print();
        s.print();
    }
}
