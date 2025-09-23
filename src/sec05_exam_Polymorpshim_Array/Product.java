package sec05_exam_Polymorpshim_Array;

public class Product {
    int price, bonusPoint;


    public Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(this.price/10.0);
    }

    public Product() {
    }
}
