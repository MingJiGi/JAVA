package Person;

public class PersonExmaple1 {

    static final int max = 100;

    public static void main(String[] args) {

       //static final int max = 100;
        //static final 은 반드시 클래스 내에 선언 해야하며 메인에서는 선언 불가능



        finalExample person = new finalExample("123456-123456", "홍길동");
        System.out.println(person.nation);
        System.out.println(person.ssn);
        System.out.println(person.name);

       // person.nation ="USA"; // nation은 이미 korean 이라는 값으로 초기화 되어있어서 불변한다
        // person.ssn = "781125-11111"; // person 객체를 만들때 ssn을 초기화 해줫기 때문에 값을 다시 대입불가
        person.name = "우민식"; // 상수와 변수의 차이


        //결론
//        1. static final  : 정적불변의 상수, 메모리상단(쿨래스영역, 메서드영역, 정적영역)
//        에 하나만 생성이 되고 공유되는 상수이다.
//
//        2.final : 불변의 인스턴스 상수, 메모리의 힙에 할당이 된다. new 연산자를 몇 번 외치든 간에
//                만들어진 인스턴스만큼 생성된다.



    }
}
