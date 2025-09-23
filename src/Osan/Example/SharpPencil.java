package Osan.Example;

public class SharpPencil extends Super_Main{
    private int width;

    public SharpPencil(int amount, int width) {
        super(amount);
        System.out.println("SharpPencil 생성자 호출");
        this.width = width;
    }

    @Override
    public void print() {
        System.out.println("SharpPencil amount : " +
                getAmount() + "/ width : " + this.width);
    }
}