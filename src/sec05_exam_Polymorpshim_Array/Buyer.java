package sec05_exam_Polymorpshim_Array;

import java.util.Vector;

public class Buyer {

    int money = 100000; // 소유금액
    int bounusPoint = 0; // 적립금

    //Vector는 기본적으로 10개의 방을 생성해준다.
    //10개를 넘어서면 자동 늘어난다. 정적인 배열에 비하여 상당히 괜찮은 자료구조이다.
    //배열기반이기 때문에 인덱스를 통한 접근이 가능하고 수정도 가능하다
    Vector item = new Vector();
    //물건을 구매하는 코드
    public void buy(Product p){
        if(this.money < p.price){
            System.out.println("잔액부족");
            return;
        }else{
            this.money -= p.price;
            this.bounusPoint += p.bonusPoint;
        }
        // item[i++] = produt; // 배열 이용시
        // 매개변수로 넘어온 제품을 벡터에 추가(뒤에다가 하나씩 추가해준다)
        item.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");
        }

        //물품을 반품하는 코드
    public void refund(Product product){
        if (item.remove(product)){
            this.money += product.price;
            this.bounusPoint -= product.bonusPoint;
            System.out.println(product + "을/를 반품하셨습니다.");
        }
        else {
            System.out.println("구입하신 제품목록 중에 해당되는 제품이 없습니다.");
        }
    }
    //구매한 물품의 요약정보를 나타내는 코드
    public void summary(){
        int sum = 0;
        String itemList = "";

        //구매한 물품이 없는지 확인하는 코드
        if (item.isEmpty()){
            System.out.println("구입한 물건이 없습니다.");
            return;
        }

        for (int i = 0; i < item.size(); i++) {
            //타입체크를 하는 부분(참이 나오면 형변환 가능)
            if(item.get(i) instanceof Product){
                Product product =  (Product) item.get(i);
                sum += product.price;
                // 삼항 연산자 이용
                itemList += (i==0 ? "" + product : "," + product);
            }else{
                System.out.println("Product객체가 아닙니다.");

            }
        }
        System.out.println("총 구입 금액 : " +sum);
        System.out.println("총 구매 리스트 현황 : " +itemList);
    }
}
