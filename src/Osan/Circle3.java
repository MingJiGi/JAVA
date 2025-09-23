package Osan;

public class Circle3 {
    int radius;
    String name;
    public Circle3(){
        radius = 1;
    }
    public Circle3(int radius, String name){
        this.radius = radius;
        this.name = name;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    void print(){
        System.out.println(name + "의 면적은" + getArea());
    }
    public static void main(String[] args) {
        Circle3 pizza = new Circle3(10, "자바피자");
        pizza.print();

        Circle3 donut = new Circle3();
        donut.name = "도넛피자";
       donut.print();

    }
}
