package Person;

public class Car1 {
    String color; // 자동차 색상
    String gearType; // 변속기 종류
    int door; // 문의 갯수
    public Car1(){
        this("white","auto",4);
    } // 기본생성자

    public Car1 (String color){
        this(color,"auto",4);
    }

    public Car1(String color , String gearType){
        this(color,gearType,4);
    }

    //매개변수가 있는 생성자
    public Car1(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public String getColor() {
        return color;
    }

    public String getGearType() {
        return gearType;
    }

    public int getDoor() {
        return door;
    }




    @Override
    public String toString() {
        String str = "색상 : " + this.getColor() + ", 기어 : " + this.getGearType() + ", 문 갯수" + this.getDoor();
        return str;
    }
}
