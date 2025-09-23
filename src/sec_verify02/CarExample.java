package sec_verify02;

public class CarExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println("car1.company : "+c1.company);

        Car c2 = new Car("자가용");
        System.out.println("car2.company : "+c2.company +"\n car2.model : " + c2.model);


        Car c3 = new Car("자가용","빨강");
        System.out.println("car3.company : "+c3.company +"\n car3.model : " + c3.model +
                "\n car3.color : " + c3.color);

        Car c4 = new Car("자가용","빨강",300);
        System.out.println("car4.company : "+c4.company +"\n car4.model : " + c4.model +
                "\n car4.color : " + c4.color + "\n car4.maxSpeed : " + c4.maxSpeed);

    }
}
