package sec03_exam_RepairableExample;

public class DropShip extends AirUnit implements Repairble{



    static int hitPoint;


    public DropShip() {
        super(150);
        System.out.println(this.toString() + "의 Hp는 " + this.MAX_HP + "입니다.");
        DropShip.hitPoint = this.MAX_HP;
    }

    @Override
    public String toString() {
        return "Tank";
    }

    @Override
    public void DamageUnit(Repairble r, int Damage) {
        //타입 체크
        if (r instanceof Unit){
            Unit unit = (Unit)r;
            System.out.println(unit + "가" + Damage + "만큼 데미지를 입었습니다");
            System.out.println(unit + "의 현재 HP는" + (unit.MAX_HP - Damage) + "만큼 데미지를 입었습니다.");
            System.out.println(unit + "의 수리가 필요합니다.");
        }
        Tank.hitPoint -= Damage; //체력이 감소


    }
}
