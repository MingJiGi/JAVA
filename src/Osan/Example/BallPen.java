package Osan.Example;

public class BallPen extends Super_Main{
    private String color;

    public BallPen(int amount, String color) {
        super(amount);
        System.out.println("BallPen 생성자 호출");
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("Ballpen amount : "
                + getAmount() + "/ color" +
                color);
    }
}
