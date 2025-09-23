package Practice_Chap09;

public class StudentExmaple extends Person {
    private String s_num;

    public StudentExmaple(String p_name, String s_num){
        super(p_name); // 조상 클래스의 매개변수가 있는 생성자를 호출
        this.s_num = s_num; // 자기자신의 멤버변수를 초기화
    }

    //super : 조상클래스의 인스턴스를 가르키고 있다.
    //this : 자기자신의 인스턴스를 가르킨다.
    @Override
    public String toString() {
        String str = "학번 :  " + this.s_num + "\n" + super.toString();
        return str;
    }
}
