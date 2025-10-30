package sec11_exam_thread_join;

public class JoinExample {
    public static void main(String[] args) {

        double avg = 0.0;
        long total = 0L;

        sumThread sumThread = new sumThread();
        sumThread.start();

        //sumThread의 run()가 끝나지 않았을때 getSum()을 호출하면 1~10000까지의 합이
        // 나오리란 보장이 없다. 그래서 sumThread가 끝날때까지 기다려주는 코드가 필요하다 그게바로 join()이다.)
        try {
            // 메이스레드는 sumThread가 끝날 때까지 기다린다. (일시정지)
            sumThread.join();
        } catch (InterruptedException e) {}


        total = sumThread.getSum();
        avg = (double) total / 10000;

        System.out.println("1~10000까지의 합 : "+ sumThread.getSum());
        System.out.println("1~10000까지의 합의 평균 : "+ avg);


    }
}
