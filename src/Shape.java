public class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}
class Circle extends Shape{
    public void paint(){
        super.draw();
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }

}
class a{
    public static void main(String[] args) {
        Shape s = new Circle();
        Circle a = (Circle) s;
        a.paint();
    }
}
