package sec05_exam_instance_copy;

public class Car {
    String color; // 자동차 색상
    String gearType; // 변속기 종류
    int door; // 문의 갯수
    public Car(){
        this("white","auto",4);
    } // 기본생성자

    public Car (String color){
        this(color,"auto",4);
    }

    public Car(String color , String gearType){
        this(color,gearType,4);
    }

    //매개변수가 있는 생성자
    public Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
// 인스턴스의 복사를 위한 생성자 --> 객체 초기화(Object Initialization)
    public Car(Car car){
        this.color = car.color;
        this.gearType = car.gearType;
        this.door = car.door;
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
