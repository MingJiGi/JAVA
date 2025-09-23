package sec02_exam_starCraftUnit;

public class UnitExample {

    public static void main(String[] args) {

       // Unit unit = new Unit() 추상클래스라 인스턴스 생성이 안됨
        System.out.println("----------------------------------");
        Tank tank = new Tank();
        tank.move(100,300);
        tank.sizeMode();
        tank.stop("탱크",300,400);
        System.out.println("----------------------------------");

        System.out.println("----------------------------------");
        Marine mr = new Marine();
        mr.move(200, 300);
        mr.stimPack();
        mr.stop("마린",200,300);
        System.out.println("----------------------------------");

        System.out.println("----------------------------------");
        DropShip ds = new DropShip();
        ds.move(300, 400);
        ds.load();
        ds.stop("드랍쉽",200, 500);
        ds.unload();
        System.out.println("----------------------------------");





















    }
}
