package sec07_exam_anonumousImplemants;

import sec07_user_define_excption_01.BlanceInsufficientExcption;

public class Account {

    private long balance;


    //현재 잔액 확인
    public long getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println("입금이 완료되었습니다." + balance + "원");
    }
    //출금하기
    public void withDraw(int money) throws BlanceInsufficientExcption{
        if (this.balance < money){
            throw new BlanceInsufficientExcption(
                    "잔고 부족 : " + (money - this.getBalance())+ "모자람");
        }
        this.balance -= money;
    }


}
