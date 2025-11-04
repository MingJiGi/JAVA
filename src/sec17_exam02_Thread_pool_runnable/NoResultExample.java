package sec17_exam02_Thread_pool_runnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
    public static void main(String[] args) {

        //해당 PC CPU의 코어수를 최대 스레드 수로 준다.(ex, 듀얼코어는 2, 쿼드코어는 4)
        ExecutorService executorService = Executors.newFixedThreadPool(
          Runtime.getRuntime().availableProcessors()
        );

        //Runnable 익명 구현객체 생성(작업객체) --> 리턴값이 없다.
        System.out.println("작업처리 요청");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    sum += i;
                }
                System.out.println("작업처리 결과 : " + sum);
            }
        };
        //작업큐에 작업을 넣는 행위를 한다. (submit) Runnable에는 리턴값이 없기 때문에
        // 작업이 완료될 때까지 Future 지연완료객체로써 기다려준다.
        Future<?> future = executorService.submit(runnable);

        try {
            // 여기서 블로킹이 일어난다.
            Object object = future.get();
            System.out.println("작업처리 완료");
            System.out.println("Future의 get() 가 리턴값 : " + object);
        } catch (InterruptedException | ExecutionException e) {}
    executorService.shutdown();
    }
}
