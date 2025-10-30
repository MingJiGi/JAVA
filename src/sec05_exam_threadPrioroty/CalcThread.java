package sec05_exam_threadPrioroty;

public class CalcThread  extends  Thread{


    long sum;

    //외부에서 이름을 받아서 생성
    public CalcThread(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("작업을 마친 스레드 : " + this.getName());
        System.out.println("합계 : " + sum);
    }
}
