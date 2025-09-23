package sec_verify02;

import java.util.Scanner;

public class GoodsExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개의 상품을 입력 받으시겠습니까?");
        Goods[] goodArray = new Goods[scanner.nextInt()];

        for (int i = 0; i < goodArray.length; i++) {
            //상품 이름 입력받는 코드
            System.out.print(i+1 + "번 째 삼품 이름 : ");
            String name = scanner.next();
            //가격 입력 받는 코드
            System.out.print(i+1 + "번 째 상품 가격 : ");
            int price = scanner.nextInt();
            //재고 입력 받는 코드
            System.out.print(i+1 + "번 째 상품 재고 : ");
            int numberOfStock = scanner.nextInt();
            //팔린 상품 입력 받는 코드
            System.out.print(i+1 + "번 째 상품 팔린 수량 : ");
            int sold = scanner.nextInt();

            goodArray[i] = new Goods(name,price,numberOfStock,sold);
        }
        System.out.println("입력하신 상품의 이름, 가격, 재고, 팔린수량의 현황입니다.");


        //향상된 for문
        for(Goods a : goodArray){
            System.out.println(a);
        }
//
//        for (int i = 0; i < goodArray.length; i++) {
//            System.out.println(goodArray[i]);
//        }






        scanner.close();



    }


}
