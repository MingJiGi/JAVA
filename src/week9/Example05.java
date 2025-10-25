package week9;
class Cat{
    String breed;
    String color;
    Cat(){
        System.out.println("Cat()생성자 호출");
    }
    Cat(String pBreeed){
        System.out.println("Cat(...)생성자 호출");
        breed = pBreeed;
    }

}



public class Example05 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("페르시안");
        Cat cat2 = new Cat("샴");
        Cat cat3 = new Cat();
        cat3.breed = "러시안블루";

        System.out.println(cat1.breed);
        System.out.println(cat2.breed);
        System.out.println(cat3.breed);

    }
}
