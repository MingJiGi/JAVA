package sec08_exam_thread_state;

//StatePrintThread는 TargetThread의 상태를 알기위한 스레드이다.
public class StatePrintThread extends Thread{
    private TargetThread targetThread;

    public StatePrintThread(TargetThread targetThread) {
        this.targetThread = targetThread;
    }

    @Override
    public void run() {
        while (true){
            //TargetThread의 상태 정보 얻는다.
            //Thread.state는 Thread클래스의 내부클래스이며, Enum(열거 ) 타입이다.
            Thread.State state = targetThread.getState();
            System.out.println("타겟스레드의 상태 : " + state);
            //tartgeThread가 생성이 되었으면 run()를 실행
            if (state == Thread.State.NEW){
                targetThread.start();
            }

            if (state == Thread.State.TERMINATED){
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}
