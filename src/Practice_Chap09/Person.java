package Practice_Chap09;

//조상 클래스
public class Person {
    String P_name;

    public Person(){
        this("홍길동");
    }

    public Person(String p_name){
        super(); // Object 호출
        this.P_name = p_name;
    }

    @Override
    public String toString() {
        return "이름 : " + this.P_name;
    }
}
