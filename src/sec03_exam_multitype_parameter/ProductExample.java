package sec03_exam_multitype_parameter;

public class ProductExample {
    public static void main(String[] args) {

        Product<Tv, String> p1 = new Product<>();
        p1.setT(new Tv(06,2025));
        p1.setM("LG OLED TV");

        System.out.println("나의 TV는 " + p1.getT().getYear() + "년" +
                p1.getT().getMonth() + "월 에 생산된" + p1.getM() + "이다");


        System.out.println("------------------------------------------------");
        Product<Car,String> car = new Product<>();
        car.setT(new Car("현대",10,2021));
        car.setM("AVANTE");
        System.out.println("나의 자동차 브랜드는" + car.getT().getBrand()+"이며" +
                car.getT().getYear()+"년식"+ car.getT().getMonth()+"월에 생산된" +car.getM() + "입니다");

    }
}
