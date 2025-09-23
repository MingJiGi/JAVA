package sec_verify02;

import java.util.Scanner;


public class Osan1_main {

    private static Osan1[] s = new Osan1[100];
    private static Scanner in = new Scanner(System.in);



    public static void main(String[] args) {

        while(true){
            System.out.println("----------------");
            System.out.println("학생이력관리 시스템");
            System.out.println("----------------");
            System.out.println("학생등록 : 1");

            int userSelect = in.nextInt();
            switch (userSelect){
                case 1 : CreateAccount();
                    break;
                case 2 : break;
            }


        }
    }
    private static void CreateAccount(){
        System.out.println("이름 : ");
        String a = in.next();
        System.out.println("학번 : ");
        String b = in.next();
        System.out.println("성별 : ");
        String c = in.next();

        Osan1 newAccount = new Osan1(a,b,c);
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null){
                s[i] = newAccount;
            }
        }
    }
}
