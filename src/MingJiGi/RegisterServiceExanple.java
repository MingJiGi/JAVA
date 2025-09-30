package MingJiGi;

import java.util.Scanner;

public class RegisterServiceExanple {
    public static void main(String[] args) {
        RegisterService rg = new RegisterService();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("------------------------");
            System.out.println("회원가입");
            System.out.print("ID 입력해주세요 : ");
            String id = sc.next();
            System.out.print("PW 입력해주세요 : ");
            String PW = sc.next();
            System.out.println("------------------------");
            rg.checkCredentials(id,PW);

        }catch (InvoalidIdExcotion e){
            System.out.println(e.getMessage());




        } catch (InvalidPasswordException s) {
            System.out.println(s.getMessage());
        }finally {
            System.out.println("검사를 종료합니다");
        }



    }
}
