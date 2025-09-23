package sec_verify03;

public class carExample {
    public static void main(String[] args) {
        Car car = new Car();
        int problemLocation = 0;

        for (int i = 0; i < 20; i++) {

            problemLocation = car.run();

            switch (problemLocation){
                case 1 :
                    System.out.println("앞왼쪽 kumhoTire로 교체");
                    car.frontLeftTire = new KumhoTire("앞왼쪽", 15);
                    break;
                case 2 :
                    System.out.println("앞오른쪽 kumhoTire로 교체");
                    car.frontLeftTire = new KumhoTire("앞오른쪽", 13);
                    break;
                case 3 :
                    System.out.println("뒤왼쪽 HankookTire로 교체");
                    car.frontLeftTire = new HankookTire("뒤왼쪽", 14);
                    break;
                case 4 :
                    System.out.println("뒤오른쪽 HankookTire로 교체");
                    car.frontLeftTire = new HankookTire("뒤 오른쪽", 12);
                    break;

            }

        }
    }
}
