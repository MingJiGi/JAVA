package Practice_Chap09;

public class ColorPoint extends Point1{
    String color;

    public ColorPoint(){

    }

    public void setColor(String Color){
        this.color = Color;
    }

    public void showColorPoint(){
        System.out.print("색상이 " + this.color + "점의 좌표 : ");
        super.showPoint();

    }

}
