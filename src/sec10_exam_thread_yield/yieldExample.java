package sec10_exam_thread_yield;

public class yieldExample {
    public static void main(String[] args) {

        ThreadA threadA = new ThreadA(); // 우선순위 5
        ThreadB threadB = new ThreadB(); // 우선순위 5

        threadA.start();
        threadB.start();

        //3초 동안은 번갈아 실행하다가 이후, ThreadA를 yeild() 호출함으로써,
        //ThreadB 만 실행하게 된다.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        threadA.work = false;
        //다시 3초후, ThreadB가 yeild() 호출함으로써 ThreadA만 실행.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        threadA.work = true;
        threadB.work = false;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        threadA.stop = true;
        threadB.stop = true;
    }
}
