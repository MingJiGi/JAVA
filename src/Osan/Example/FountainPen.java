package Osan.Example;

public class FountainPen extends BallPen{

    public FountainPen(int amount, String color) {
        super(amount, color);
        System.out.println("FountainPen 생성자 호출");
    }

    public void refill(int n){
        setAmount(n);
    }


    @Override
    public void print() {
        System.out.println("FountainPen amount : "
                + getAmount()
                + "/ color : "
                + getColor());
    }
}
