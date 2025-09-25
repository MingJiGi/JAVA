package MingJiGi;

public class dog extends Animal implements Feedable {
    public dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }


    @Override
    public void feed(String food) {
        System.out.println(name + food + "가 를 먹습니다.");
    }
}