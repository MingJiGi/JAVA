package sec05_exam_Polymorpshim_Array;


import java.util.Iterator;

public class PolyArgumentExample {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Apple apple = new Apple();
        Computer com = new Computer();
        Audio audio = new Audio();


        System.out.println("벡터 용량 : " + b.item.capacity());
        System.out.println("벡터 크키 : " + b.item.size());

        b.buy(new Audio());
        b.buy(new Audio());
        b.buy(new Audio());
        b.buy(new Audio());

        b.refund(audio);

        //반복자
        Iterator it = b.item.iterator();
        while (it.hasNext())//벡터에서 가져올게 있는가 ?
        {
            Product p = (Product) it.next();
            System.out.println(p);
        }


//        b.buy(apple) 에러가 뜨는 이유는 product를 상속받지 않앗기 때문에.
        System.out.println("벡터 용량 : " + b.item.capacity());
        System.out.println("벡터 크키 : " + b.item.size());

        b.summary();
    }
}
