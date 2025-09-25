package MingJiGi;

public class Cat extends Animal implements Feedable{
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    @Override
    public void feed(String food) {
        System.out.println(name + food +"가 를 먹습니다.");
    }
}
