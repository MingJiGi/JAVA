package Person;

public class finalExample {

    final String nation = "korean"; // 상수 선언
    final String ssn;
    String name;

//    final 초기화 방법
//    1. 선언과 동시에 초기화
//    2.생성자에서 단 한번 초기화 가능
//    매개변수가 있는 생성자

    public finalExample(String ssn, String name){
//        this.nation = "aaaa"; // nation = "korea" 초기화를 이미 진행해서 안된다.
//        this는 객체 자기 자신의 주소 (참조변수와 동일)
//        this는 finalExample이라는 인스턴스(new)가 만들어질 때, 비로서 활성화 된다.
        this.ssn = ssn;
        this.name = name;
    }



}
