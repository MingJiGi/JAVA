package sec06_exam_thread_unsynchcronized;


// 공유 객체
// 비동기화 메소드
public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

//    public void print(){
//        System.out.println(Thread.currentThread().getName());
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//    }

}
