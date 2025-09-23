package Osan.Example;

//자식클래스
public class ColorPoint extends Point{
    private String color;
    public void setColor(String color){
        this.color = color;
    }
    public void showColorPoint(){
        System.out.print(color);
        showPoint();
    }
}
