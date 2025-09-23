package sec_verify02;

public class MoutainBike extends Bicycle{
    String frame, money;
    int gear;


    public MoutainBike(int id, String brand) {
        super(id, brand);
    }

    public MoutainBike(int id, String brand, String frame, String money, int gear) {
        super(id, brand);
        this.frame = frame;
        this.money = money;
        this.gear = gear;
    }

    public void prtinfo(){
        System.out.println("내 자전거는 상표 (브랜드)가 : " + super.brand +"입니다.");
        System.out.println("내 자전거는 차대 (id)가 : " + super.id +"입니다.");
        System.out.println("기어는" + this.gear + "단 입니다.");
        System.out.println("프레임은 " + this.frame +"입니다.");
        System.out.println("가격은 " +this.money+"입니다.");
    }
}
