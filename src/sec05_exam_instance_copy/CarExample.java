package sec05_exam_instance_copy;

public class CarExample {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car(c1);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println();

        c2.door = 100;
        c2.color = "yellow";

        Car c3 = new Car(c1);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
