package sec06_exam_bounded_parameter_type;

public class Util {
    //매개변수의 T타입 자체를 Number(추상클래스)의 자손클래스들만으로 제한시켜버림.
    public static <T extends Number> int compare(T t1, T t2){
        //Number 클래스의 doubleValue()란 추상 메서드였지만,
        // 자손클래스 (Integer, Double 등) 가 재정의 했기 때문에
        // 아래코드는 문제가 전혀 되지 않는다.




        double value1 =  t1.doubleValue();
        double value2 =  t2.doubleValue();


        return Double.compare(value1,value2);
    }
}
