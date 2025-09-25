package MingJiGi;

public class Lion extends Animal implements Feedable{
    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("어흥");
    }


    @Override
    public void feed(String food) {
        System.out.println(name + food +"가 를 먹습니다.");
    }
}
