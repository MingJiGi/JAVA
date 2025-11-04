package sec17_exam01_thread_pool_submit_excute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteSubmitExample {
    public static void main(String[] args) {

        //자기 자신의 코어의 개수만큼 스레드를 생성함.
        //미리 만들어져있는 것이 아니라 요청이 들어오면 생성이되는 것이다.
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        //newFixedThreadPool과 newCachedThreadPool은 내부적으로 ThreadPoolExecutor로 만들어 졌기 때문에
        // 타입 변환으로 TheradPoolExecutor 객체를 얻을수 있다.
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        //스레드풀에 있는 스레드 개수를 리턴하여 얻을수 있다. (gerPoolSize())
        System.out.println("생성된 스레드 수(초기 스레드수) : " + threadPoolExecutor.getPoolSize());

        for (int i = 0; i < 20; i++) {
            //20개의 작업객체 생성
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("총 스레드 갯수 : " + poolSize + ", 스레드 이름 : " + threadName);
//                    try {
//                        System.out.println("try");
//                        int value = 10 / 0;
//                    }catch (Exception e){ System.out.println("catch");}
                }
            };
            /*
            작업큐에 runnable객체를 넣는 행위, execute() 는 작업 처리 도중에 예외가 발생하면,
            해당 스레드를 제거하고 새로운 스레드를 생성한다. submit()은 예외가 발생하더라도,
            해당 스레드를 제거하지 않고 재사용을 한다. 하여 submit()을 사용하는 것이 좋다.
             */
//            executorService.execute(runnable);
            executorService.submit(runnable);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        }
        executorService.shutdown();
    }
}
