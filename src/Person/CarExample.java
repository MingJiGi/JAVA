package Person;

public class CarExample {
    public static void main(String[] args) {

//        Car car1 = new Car();
//        car1.color = "yellow";
//        car1.door = 4;
//        car1.gearType = "auto";
//        System.out.println(car1);
//
//        Car car2 = new Car("Black", "auto", 3);
//        car2.color = "white";
//        //this.color = "red"; // 안돼는 이유는? this는 인스턴스가 생성될때 생성되므로 static에는 사용불가
//        System.out.println(car2);


        Car1 car = new Car1();
        System.out.println(car);

        Car1 car1 = new Car1("black");
        System.out.println(car1);

        Car1 car2 = new Car1("Yellow","automatic");
        System.out.println(car2);
    }
}
