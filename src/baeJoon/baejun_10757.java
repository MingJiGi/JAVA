package baeJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class baejun_10757 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String xa = input.next();
        String xb = input.next();

        BigInteger a = new BigInteger(xa);
        BigInteger b = new BigInteger(xb);

        BigInteger sum = a.add(b);

        System.out.println(sum);

    }
}
