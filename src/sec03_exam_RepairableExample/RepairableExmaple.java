package sec03_exam_RepairableExample;

public class RepairableExmaple {

    public static void main(String[] args) {

        SCV scv = new SCV();
        Marine marine = new Marine();
        Tank tank = new Tank();
        tank.DamageUnit(tank, 100);
        scv.repair(tank);
    }
}
