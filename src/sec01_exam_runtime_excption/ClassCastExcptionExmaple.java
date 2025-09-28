package sec01_exam_runtime_excption;

class Animal{};
class Dog extends Animal{};
class Cat extends Animal{};



public class ClassCastExcptionExmaple {

    public static void changeDog(Animal animal){
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            System.out.println("Dog로 변환 성공");
        }else {
            System.out.println("Dog로 변환 실패");
        }
    }

    public static void main(String[] args) {

        try {
            Animal animal = new Dog(); // 다운 캐스팅
            Dog dog = (Dog)animal;
            Cat cat = (Cat)animal;

            changeDog(dog);
            changeDog(new Cat());
        } catch (Exception e) {
            System.out.println("예외 발생");
        }




    }



}
