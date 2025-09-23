package sec04_exam_Polymorpshim;

public class PolyArgumentExample {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Tv tv = new Tv();
        computer computer = new computer();


        //매개변수의 다형성이 아래의 코드에서 이루어 지고 있다.
        buyer.buy(tv);
        buyer.buy(computer);
        buyer.buy(new Tv());
        buyer.buy(new computer());
        buyer.buy(new Tv()); // 잔액초과


        System.out.println("현재 잔액 : " + buyer.money);
        System.out.println("현재 보너스 포인트 : " + buyer.bonusPoint);

    }
}
