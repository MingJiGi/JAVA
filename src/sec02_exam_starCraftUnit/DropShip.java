package sec02_exam_starCraftUnit;

public class DropShip extends Unit{

    String str;

    public DropShip() {
    }



    //DropShip의 고유 메서드
    public void load(){
        this.str = "탑승모드 : 유닛 탑승 !";
        System.out.println(this.str);
    }

    public void unload(){
        this.str = "탑승모드 : 유닛 하강 !";
        System.out.println(this.str);
    }



    @Override
    public void move(int x , int y) {
        this.x  = x;
        this.y = y;
        System.out.println("드랍쉽의 위치 : " + this.x +"," + this.y + "로 이동함.");
    }


}
