package sec_verify02;

import java.util.Scanner;



public class BankApplication {
    //Account[] 계좌 목록
    private static Account[] accountArray = new Account[100]; // private staic 은 공유한다.
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("-----------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("-----------------------------------------------");
            System.out.print("선택 > ");

            //사용자로부터 1~5까지를 입력받고 이 값으로 분기를 하면 된다.
            int selecNo = scanner.nextInt();

            if (selecNo == 1){
                createAccount();
            } else if (selecNo == 2) {
                accountList();
            } else if (selecNo == 3) {
                deposit();
            } else if (selecNo == 4) {
                withdraw();
            } else if (selecNo == 5) {
                System.out.println("프로그램 종료");
                break;
            }else System.out.println("1~5번중 선택해주시기 바랍니다.");
        }
        scanner.close();

    }
//    계좌 생성 메서드 구현부
    private static void createAccount(){

        System.out.println("----------------");
        System.out.println("계좌생성");
        System.out.println("----------------");
        System.out.print("계좌번호 : ");
        //계좌번호를 입력받는 코드
        String ano = scanner.next();
        //계좌주 입력받는 코드
        System.out.print("계좌주 : ");
        String owner = scanner.next();
        //초기 입금액 입력받는 코드
        System.out.print("초기입금액 : ");
        int balnce = scanner.nextInt();

        //매개변수 3개가 있는 생성자를 호출하면 인스턴스 만드는 코드
        Account newAccount = new Account(ano,owner,balnce);
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과 : 계좌가 정상적으로 생성되었습니다.");
                break;
            }
        }
    }
    //계좌목록 메서드
    private static void accountList(){
        System.out.println("----------------");
        System.out.println("계좌목록");
        System.out.println("----------------");

        for (int i = 0; i < accountArray.length; i++){
            if (accountArray[i] != null){
                System.out.print(accountArray[i].getAno() + "\t");
                System.out.print(accountArray[i].getOwner() + "\t");
                System.out.println(accountArray[i].getBalance() + "\t");
            }
        }
    }
    //예금하기 메서드
    private static void deposit(){
        System.out.println("----------------");
        System.out.println("예금하기");
        System.out.println("----------------");

        System.out.print("계좌번호 : ");
        String ano = scanner.next();
        //예금을 할려면 계좌번호가 존재하는지 먼저 확인하는 절차가 있어야 한다.
        Account account = findAccount(ano);
        if (account == null){
            System.out.println("결과 : 계좌가 없습니다.");
            return;
        }
        System.out.print("예금액 : ");
        int money = scanner.nextInt();
        //기존 금액을 알아내고 그 금액에다가 더하면 계좌의 금액 변경
        account.setBalance(account.getBalance() + money);
        System.out.println("결과 : 예금이 성공되었습니다.");
    }
    //출금하기 메서드
    private static void withdraw(){
        System.out.println("----------------");
        System.out.println("출금하기");
        System.out.println("----------------");

        System.out.print("출금할 계좌번호 입력 : ");
        String ano = scanner.next();

        Account account = findAccount(ano);
        if (account == null){
            System.out.println("결과 : 계좌가 없습니다.");
            return;
        }
        System.out.print("출금할 금액 : ");
        int money = scanner.nextInt();
        if (money > account.getBalance()){
            System.out.print("출금할 금액이 부족합니다. 현재 잔고 : "+account.getBalance() + "\n");
            return;
        }
        account.setBalance(account.getBalance() - money);
        System.out.println("결과 : 성공적으로 출금이 완료되었습니다.");
    }

    //계좌 확인절차 메서드
    private static Account findAccount(String ano){
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            //accountArry[i]가 null 이라면 비교대상 객체가 존재하지 않으므로 아래의 코드가 필요
            if (accountArray[i] != null){
                //accountArray[i]가 null이 아니므로 계좌번호 아래와 같이 추출 가능
                String dbAno = accountArray[i].getAno();
                //추출한 계좌번호 (dbAno)와 호출한 계좌번호(ano)가 같다면 동일한 계좌가 존재
                //하므로 해당 계좌 번호를 리턴
                if (dbAno.equals(ano)){
                    account = accountArray[i];
                    break;
                }
            }
        }

        return account;
    }



}
