package sec07_exam_anonumousImplemants;

import sec07_user_define_excption_01.BlanceInsufficientExcption;

public class AccounExample {
    public static void main(String[] args) {


        Account ac = new Account();
        ac.setBalance(10000);
        System.out.println("잔액" + ac.getBalance());


        try {
            ac.withDraw(1000);
            ac.withDraw(1000000);
            System.out.println("잔액 :" + ac.getBalance());
        }catch (BlanceInsufficientExcption e){
            System.out.println("예외 원인 : " + e.getMessage());
        }

    }
}
