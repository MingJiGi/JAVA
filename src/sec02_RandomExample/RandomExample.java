package sec02_RandomExample;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        //Math.random()과 Random클래스의 가장 큰 차이점은 무엇인가 ?
        // Random클래스는 종자(Seed)값을 설정할 수가 있다.
        // 종자값이 같으면, 항상 같은 난수를 발생시킨다.)


        Random rand1 = new Random();
        Random rand2 = new Random(2);
        Random rand3 = new Random(2);

        System.out.println("----rand1----");
        for (int i = 0; i < 5; i++) {
            int num = Math.abs(rand1.nextInt() % 10) + 1;
            System.out.print(num);
        }

        System.out.println("\n----rand2----");
        for (int i = 0; i < 5; i++) {
            int num = Math.abs(rand2.nextInt() % 10) - 1;
            System.out.print(num);
        }



        System.out.println("\n----rand3----");
        for (int i = 0; i < 5; i++) {
            int num = Math.abs(rand3.nextInt() % 10) - 1;
            System.out.print(num);
        }













    }
}
