package Person;

public class PersonExample {
    public static void main(String[] args) {
        finalExample p1 = new finalExample("123456-1234567", "계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

//        p1.nation = "usa"; 해당코드가 오류나는 이유 final 즉 불변값으로 선언후 값을 초기화 햇기때문 아래도 동일
//        p1.ssn = "654321-7654321"; 위와 동일
        p1.name = "을지문덕";
    }
}
