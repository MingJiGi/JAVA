package test;

class Book{
    public Book() {
        System.out.println("Book 클래스 생성자 ~~ (파라미터 없음)");
    }
    public Book(String name){
        this();
        System.out.println("Book 클래스 생성자 ->" + name);
    }
}

class ComputerBook extends Book{
    public ComputerBook(String name) {
        super(name);
        System.out.println("ComputerBook 클래스 생성자 ~~");
    }
}


public class Exam {
    public static void main(String[] args) {
        ComputerBook sedan1 = new ComputerBook("굿 자바");
    }

}
