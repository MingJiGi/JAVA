package sec07_exam_sychronized;


public class User1 extends Thread{

    //공유객체를 선언
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        this.setName("User-1");
    }

    @Override
    public void run() {
        this.calculator.setMemory(100);
    }
}
