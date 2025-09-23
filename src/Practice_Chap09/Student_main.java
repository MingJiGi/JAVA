package Practice_Chap09;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요  : ");
        String name = sc.nextLine();
        System.out.print("학번을 입력하세요 : ");
        String num = sc.nextLine();
        StudentExmaple p = new StudentExmaple(name,num);

        System.out.println(p);

        sc.close();
    }
}
