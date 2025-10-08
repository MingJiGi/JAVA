package sec05_deep_clone;

import java.util.Arrays;

public class MemberExample {

    public static void main(String[] args) {

        Member original = new Member(25,new Car("소나타"),"홍길동",
                new int[]{90,100});
        Member cloned = original.getMember();

        System.out.println("오리지날 배열 주소" + original.scores);
        System.out.println("복제된 배열 주소" + cloned.scores);
        System.out.println("오리지날 Car 주소" + original.car);
        System.out.println("복제된 Car 주소" + cloned.car);

        System.out.println("------------------------------------");

        cloned.scores[0] = 9999;
        cloned.car.model = "그랜져";

        System.out.println(Arrays.toString(original.scores) + "Car모델 : " + original.car.model);
        System.out.println(Arrays.toString(cloned.scores) + "Car모델 : " + cloned.car.model);


    }
}
