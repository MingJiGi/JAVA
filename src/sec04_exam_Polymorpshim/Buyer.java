package sec04_exam_Polymorpshim;

public class Buyer {

    int money = 1000;
    int bonusPoint = 0;


    //매개변수 Product p의 개념을 정확히 이해하는 것이 매우 중요
    //Product뿐 아니라 Product를 상속받는 어떤 클래스라도 다 매개변수로 들어올수 있다.
    public void buy(Product p){
        if (this.money < p.price){
            System.out.println("잔액부족");
            return;
        }else{
            this.money -= p.price;
            this.bonusPoint += p.bonusPoint;
            System.out.println(p + "를 구매하셨습니다.");
        }
    }


}
