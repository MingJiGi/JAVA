package sec17_exam04_thread_pool_external_object;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByExternalExample {

    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );
        System.out.println("작업처리 요청");

        class Task implements Runnable{

            //외부 객체의 참조를 얻기 위해서 선언
            Result result;

            public Task(Result result) {
                this.result = result;
            }

            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i <=10 ; i++) {
                    sum+=i;
                }
                //스레드에서 계산되어진 값을 외부객체인 result의 addValue()를
                // 호출하여 accumValue에 누적하고 있다.
                this.result.addValue(sum);
                System.out.println("현재 실행 스레드 이름 :" + Thread.currentThread().getName() +
                        "\n 작업한 결과 : " + this.result.getAccumValue());

            }
        }
        Result result = new Result(); // 공유 객체 생성

        //작업객체 생성
        Runnable task1 = new Task(result);
        Runnable task2 = new Task(result);

        //작업 요청(작업큐에 넣는 행위)
        Future<Result> future1 = executorService.submit(task1, result);
        Future<Result> future2 = executorService.submit(task2, result);
        Future<Result> future3 = executorService.submit(task1, result);
        Future<Result> future4 = executorService.submit(task2, result);
        Future<Result> future5 = executorService.submit(task1, result);
        Future<Result> future6 = executorService.submit(task2, result);

        result = future1.get();
        Thread.sleep(1000);
        result = future2.get();
        Thread.sleep(1000);
        result = future3.get();
        Thread.sleep(1000);
        result = future4.get();
        Thread.sleep(1000);
        result = future5.get();
        Thread.sleep(1000);
        result = future6.get();
        Thread.sleep(1000);


        System.out.println("작업처리 결과 : " + result.accumValue);
        System.out.println("작업처리 완료");
        System.out.println("현재 실행 스레드 이름 : " + Thread.currentThread().getName());

        executorService.shutdown();
    }
}
