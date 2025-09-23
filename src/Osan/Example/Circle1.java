package Osan.Example;

public class Circle1 {
    String name;
    int radius;

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle1 Pizza = new Circle1();
        Pizza.radius = 10;
        Pizza.name = "자바피자";
        double area = Pizza.getArea();
        System.out.println(Pizza.name + "의 면적은" + area);

        Circle dounut = new Circle();
        dounut.radius = 2;
        dounut.name = "자바도넛";
        double area1 = dounut.getArea();

        System.out.println(dounut.name + "의 면적은" + area1);
    }
}
