package sec02_exam_starCraftUnit;

//추상클래스, 조상클래스
public abstract class Unit {

    int x;
    int y;
    String str;

    public abstract void move(int x,int y);

    public void stop(String str, int x, int y){
        this.x = x;
        this.y = y;
        this.str = str;
        System.out.println("현재위치 : " + this.x + ","+this.y + "에" +this.str + "가/이 멈춥니다.");
    }
}
