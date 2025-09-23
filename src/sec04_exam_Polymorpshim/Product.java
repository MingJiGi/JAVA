package sec04_exam_Polymorpshim;

public class Product {

    int price; // 가격 변수
    int bonusPoint; //보너스 포인트 적립 받을 변수

    public Product(int price) {
        this.price = price;
        // 보너스 점수는 제품가격의 10% 를 적립
        this.bonusPoint = (int)(price/10.0);
    }
}
