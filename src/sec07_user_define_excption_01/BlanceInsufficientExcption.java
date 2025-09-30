package sec07_user_define_excption_01;

public class BlanceInsufficientExcption extends Exception{


    public BlanceInsufficientExcption() {
    }

    public BlanceInsufficientExcption(String message) {
        super(message); // 조상클래스 생성자 호출
    }
}
