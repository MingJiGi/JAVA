package sec17_exam03_thread_pool_callable;

import java.util.concurrent.*;

public class ResultByCallableExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );
        //Callable 익명 구현객체 생성(작업객체) --> 리턴값이 <T> 타입으로 존재한다.
        //소로, 리턴값이 <T> 타입과 동일해야 한다
        System.out.println("작업처리요청");

        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    sum += i;
                }

                return sum;
            }
        };
        Future<Integer> future = executorService.submit(callable);
        /*
        작업큐에 작업을 넣는다.
        리턴값이 <T>. 하여 Future<T> submit(Callable task)를 선택한다.
        작업이 완료될때까지 블로킹 즉 기다린다. Future는 지연완료객체이다.
        Future역시 <T> 타입으로 설정해야 한다
         */
        try {
            //블로킹이 일어난후, 결과값이 자동 언박싱이 이루어 진다.
            int value = future.get();
            System.out.println("작업처리 결과 : " + value);
            System.out.println("작업처리 완료");
        } catch (InterruptedException | ExecutionException e) {}

        executorService.shutdown();
    }
}
