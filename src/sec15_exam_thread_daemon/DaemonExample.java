package sec15_exam_thread_daemon;

public class DaemonExample {
    public static void main(String[] args) {

        AutoSaveThread autoSaveThread = new AutoSaveThread();
        System.out.println(autoSaveThread.isDaemon());

        //데몬스레드는 종속적 스레드이다. 메인스레드가 종료되면 따라서 같이 종료된다.
        autoSaveThread.setDaemon(true);
        System.out.println(autoSaveThread.isDaemon());

        autoSaveThread.start();

        /*
        메인스레드가 5초 동안 정지하면, daemon 스레드인 autoSaveThread가
        실행되고 메인스레드가 종료되면 더 이상 autoSaveThread가 실행이
        안된다는 것을 알 수가 있다. (종속적 스레드의 특징)
         */
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        System.out.println("메인 스레드 종료됨.");
    }
}
