package sec03_exam_RepairableExample;

public class SCV extends GroundUnit implements Repairble{


    public SCV() {
        super(60);
        this.hitPoint = this.MAX_HP;
    }


    public void repair(Repairble r){
    if (r instanceof Unit){
        int count = 0;
        // Unit의 타입이 맞다면 자손클래스(Tank, Dropship, SCV를 UNIT 타입으로 강제 형변환)
        Unit unit = (Unit)r;
        System.out.println("현재 체력 : " + unit.MAX_HP);
        while (unit.hitPoint != unit.MAX_HP){
            //unit의 HP를 증가시킨다
            unit.hitPoint++;
            count++;
        }

        System.out.println(unit + "의 HP가"+ count + "만큼 수리가 끝낫습니다.");

    }

    }
    @Override
    public void DamageUnit(Repairble r, int Damage) {
        if (r instanceof Unit){
            Unit unit = (Unit)r;
            System.out.println(unit + "가" + Damage + "만큼 데미지를 입었습니다");
            System.out.println(unit + "의 현재 HP는" + (unit.MAX_HP - Damage) + "만큼 데미지를 입었습니다.");
            System.out.println(unit + "의 수리가 필요합니다.");
        }
    }

}