package sec14_exam01_Thread_interrupt;

public class PrintThread extends Thread {

    @Override
    public void run() {
        //아래는 일부러 일시정지 상태로 만든것이다. 현업에서는 이런
        // 프로그래밍은 없다. 일시정지 상태를 만들지 않고 종료 시키는 것이 대다수다.
        try {
            while (true) {
                System.out.println("실행 중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("예외 발생");
            System.out.println("interrupt() 호출됨");
        }
        System.out.println("시스템 자원 정리 완료");
        System.out.println("스레드 종료");
    }
}
