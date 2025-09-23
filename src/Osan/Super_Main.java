package Osan;

public class Super_Main {
    private int amount;

    public void print(){
        System.out.println("Super_Main amount : "
                +amount +"\n");
    }

    public Super_Main(int amount) {
        this.amount = amount;
        System.out.println("Super_Main 생성자 호출");
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
