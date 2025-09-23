package Person;

public class ReferenceReturnClass {
    public static void main(String[] args) {
        Data d = new Data();
        // copy() 메서드는 매개변수로 Data 타입의 인스턴스의 주소를 던지고 있다.
        Data result = ReferenceReturnClass.copy(d); //d 의 주소값을 copy 메서드로 넘겨줌 1 6
        System.out.println("main() 메서드에서 생성한 d인스턴스의 주소값 : " + d);
        System.out.println("main() 메서드에서 copy() 메서드를 호출하고 리턴받은 주소값 : " + result);
        System.out.println("d.x : " + d.x);
        System.out.println("result.x : " + result.x);
    }

    public static Data copy(Data d){
        Data d2 = new Data(); // Data 타입의 d2객체 생성 2
        d2.x = d.x; // d2.x에 d.x 값을 저장  3
        System.out.println("copy () 메서드에서 만든 d2의 주소값 : " + d2); // d2.x 의 값은 d.x와 동일 4
        //리턴타입이 Data클래스 타입이므로 리턴값은 반드시 Data 클래스 타입의 인스턴스의 주소가 된다.
        return d2; //5
    }
}
