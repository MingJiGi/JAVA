package baeJoon;

import java.util.Scanner;

public class baejun_30087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] arr = new String[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < a; i++) {
           if (arr[i].equals("Algorithm")) System.out.println(204);
           else if (arr[i].equals("Network")) System.out.println(303);
           else if (arr[i].equals("CyberSecurity")) System.out.println("B101");
           else if (arr[i].equals("Startup")) System.out.println(501);
           else if (arr[i].equals("ArtificialIntelligence")) System.out.println(302);
           else if (arr[i].equals("TestStrategy")) System.out.println(105);
           else if (arr[i].equals("DataAnalysis")) System.out.println(207);

        }
    }
}
