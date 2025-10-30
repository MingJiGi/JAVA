package sec06_exam_thread_unsynchcronized;

public class User1 extends Thread{

    //공유객체를 선언
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        this.setName("User-1");
    }

    @Override
    public void run() {
//        this.calculator.print();
        //공유객체의 필드인 memory 값을 100으로 변경
        this.calculator.setMemory(100);
        System.out.println("User1  " + this.calculator.getMemory());

    }
}
