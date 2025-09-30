package sec06_exam_bounded_parameter_type;

public class BoundedTypeParameterExmaple {

    public static void main(String[] args) {
        //예외 발생 이유는 Number를 상속받는 애들만 사용할수있게 제한을 걸었기 때문에
        //int result =  Util.compare("홍길동","김길동");

        //Integer 로 제한을 걸엇기 때문에 100.1 은 double 타입이라 안된다
//       int result = Util.<Integer>compare(100,100.1);

       int result = Util.<Integer>compare(100,100);

       //Number 는 추상클래스 이기 때문에 생성 못함
//       Util.<Number>compare(new Number(), new Numer());


        // Object는 최고위 조상이기 때문에 Number을 상속받지 않음
//        int result = Util.<Object>compare(new Object(), new Object());

        int result1 = Util.compare(100, 200);
        System.out.println(result1);

        result1 = Util.compare(100.1, 200);
        System.out.println(result1);

        result1 = Util.compare(new Integer(100), new Integer(200));
        System.out.println(result1);


    }
}
