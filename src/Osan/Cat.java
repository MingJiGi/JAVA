package Osan;

public class Cat {
    String breed;
    String color;
    Cat(){
        System.out.println("Cat() 생성자 호출합니다.");
    }
    Cat(String pBreed){
        System.out.println("Cat(...)생성자 호출합니다.");
    }
    Cat(String pBreed, String pColor){
        breed = pBreed;
        color = pColor;
    }
    void eat(){
        System.out.println("먹이를 먹다");
    }
    void scratch(){
        System.out.println("발톱으로 할퀴다.");
    }
    void meow(){
        System.out.println("야옹하고 울다.");
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("샴");
        Cat cat3 = new Cat("러시안블루", "회색");

        System.out.println("첫 번째 고양이 품종 : " + cat1.breed + "\t색상 : " + cat1.color);
        System.out.println("두 번째 고양이 품종 : " + cat2.breed + "\t색상 : " + cat2.color);
        System.out.println("세 번째 고양이 품종 : " + cat3.breed + "\t색상 : " + cat3.color);
    }
}
