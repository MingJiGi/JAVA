package sec02_exam_starCraftUnit;

public class Marine extends Unit{

    String str;

    public Marine() {
    }


    // Marine만의 고유메서드
    public void stimPack(){
        this.str = "공격모드 : 스팀팩 장전";
        System.out.println(this.str);
    }



    @Override
    public void move(int x , int y) {
        this.x  = x;
        this.y = y;
        System.out.println("마린의 위치 : " + this.x +"," + this.y + "로 이동함.");
    }


}
