package week9;

class book{
    book(){
        System.out.println("Book 클래스 생성자 ~~(파라미터 없음)");
    }
    book(String a){
        this();
        System.out.println("Book 클래스 생성자 ->" + a);
    }
}
class ComputerBox extends book{
    public ComputerBox(String a) {
        super(a);
        System.out.println("ComputerBook 클래스 생성자~~");
    }
}

public class Exam {
    public static void main(String[] args) {
    ComputerBox sadan1 = new ComputerBox("굿 자바");
    }
}
