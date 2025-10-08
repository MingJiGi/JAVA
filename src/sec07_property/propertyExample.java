package sec07_property;

public class propertyExample {

    public static void main(String[] args) {

        Point p = new Point(2,3);
        //클래스 이름얻기
        System.out.println(p.getClass().getName());
        System.out.println(p.getClass().getSimpleName());
        //해시 코드값
        System.out.println(p.hashCode());
        //객체의 실제 주소값
        System.out.println(p.toString());
    }
}
