package sec01_class;

public class ClassExample {

    public static void main(String[] args) {
        //객체로부터 클래스 정보를 얻는 방법(Object클래스의 getClass()) 이용
        System.out.println("1.생성한 객체로부터 클래스의 정보를 얻는 방법");

        Car car = new Car();
        car.stop();
        Class class1 = car.getClass();
//        class1.stop(); stop은 근본이 car 클래스이기 때문에 사용 불가능
        System.out.println(class1.getName()); // 패키지명 + 클래스명
        System.out.println(class1.getSimpleName()); // 클래스명

        System.out.println("2. 문자열로부터 생성된 클래스의 정보를 얻는 방법");

        try {
            Class class2 = Class.forName("sec01_class.Car");
            System.out.println(class2.getName()); // 패키지명 + 클래스명
            System.out.println(class2.getSimpleName()); // 클래스명

        } catch (ClassNotFoundException e) {
            System.out.println("존재하지 않는 클래스입니다.");
            e.printStackTrace();
        }
    }
}
