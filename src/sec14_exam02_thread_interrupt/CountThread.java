package sec14_exam02_thread_interrupt;

public class CountThread extends Thread{

    @Override
    public void run() {
        /*
        결과론적으로 스레드의 무한루프를 종료하기 위해서는 가장 좋은 방법이 interrupt()를 이용하는
        것이 가장 이상적이다. 일시정지에 있건 없건 간에 정상적인 종료로 유도하는 방법 중 가장 널리 이용된다.
         */



        int i = 10;
        while (true){
            System.out.println("카운트 다운 : " + i--);
            //인터럽트 호출되었는지 확인하는 조건문 필수
//            if (this.isInterrupted()) // 안스턴스 메서드

            //인터럽트를 누가 외쳣는가 ?
            if (Thread.interrupted()) { // 정적메서드
                System.out.println("인터럽트 메서드 호출됨.");
                break;
            }
            //스레드가 너무 빨리 돌아가니까 일부로 시간 지연
            for (long x = 0; x < 21000000; x++){

            }
            System.out.println("시스템 자원 정리");
            System.out.println("스레드 종료");

        }
    }
}
