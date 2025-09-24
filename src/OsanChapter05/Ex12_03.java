package OsanChapter05;

class car{
    public car() {
        System.out.println("슈퍼 클래스 생성자 호출(파라미터 없음)");
    }
    car(String str){
        System.out.println("슈퍼 클래스 생성자 호출 ==> " + str);
    }
}
class Sedan extends car{
    public Sedan(String str) {
        super(str);
        System.out.println("서브 클래스 생성자 호출 ==> " + str);
    }
}

public class Ex12_03 {
    public static void main(String[] args) {

        Sedan sedan = new Sedan("여기요 ~");
    }
}
