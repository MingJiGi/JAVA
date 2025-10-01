package OsanChapter05;

public class Animal {
    public void eat(){
        System.out.println("동물이 먹고 있습니다.");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("강아지가 먹고 있습니다.");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("고양이가 먹고 있습니다.");
    }
}
class Person extends Animal{
    @Override
    public void eat() {
        System.out.println("사람이 먹고 있습니다.");
    }
}
class DogTest{
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Animal() ,new Dog(), new Cat(), new Person()};
        for (Animal a : animals){
            a(a);
        }
    }
    public static void a(Animal p){
        p.eat();
    }
}

