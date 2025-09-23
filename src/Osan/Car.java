package Osan;

public class Car {
    String color;
    int speed;
    void upSpeed(int value){
        speed += value;
    }
    void downSpeed(int value){
        speed -= value;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "red";
        car1.speed = 0;

        car1.upSpeed(10);

        System.out.println(car1.color + "" + car1.speed);
    }
}
