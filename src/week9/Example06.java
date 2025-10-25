package week9;
class Cat1{
    String breed;
    String color;

    public Cat1() {
        System.out.println("Cat() 생성자 호출합니다.");
    }

    public Cat1(String breed) {
        System.out.println("Cat(...) 생성자 호출합니다.");
        this.breed = breed;
    }

    public Cat1(String breed, String color) {
        System.out.println("Cat(..., ...)생성자 호출합니다.");
        this.breed = breed;
        this.color = color;
    }
}




public class Example06 {
    public static void main(String[] args) {
     Cat1 cat1 = new Cat1();
     Cat1 cat2 = new Cat1("샴");
     Cat1 cat3 = new Cat1("러시안블루,","회색");
        System.out.println("첫 번째 고양이 품종 : " + cat1.breed+"\t색상 : " + cat1.color);
        System.out.println("두 번째 고양이 품종 : " + cat2.breed+"\t색상 : " + cat2.color);
        System.out.println("세 번째 고양이 품종 : " + cat3.breed+"\t색상 : " + cat3.color);

        int a = 3;
        double s = 5.5;
        System.out.println(a+s);
    }
}
