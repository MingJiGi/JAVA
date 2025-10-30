package sec07_exam_sychronized;


public class User2 extends Thread{

    //공유객체를 선언
    private Calculator calculator;
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        this.setName("User-2");
    }

    @Override
    public void run() {
        this.calculator.setMemory(50);
    }
}
