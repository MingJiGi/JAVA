package baeJoon;

import java.util.Scanner;

public class baeJoon_11718 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arr = new String[3];

        for (int i = 0; i < arr.length; i++) arr[i] = in.next();

        for (int i = 0; i < arr.length; i++) System.out.println(arr[i]);

        in.close();

    }
}
