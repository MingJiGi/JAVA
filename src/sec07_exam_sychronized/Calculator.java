package sec07_exam_sychronized;

//공유클래스
public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    //동기화 메서드, 확실히 공유객체에 접근하기 위해서 User1이 먼저 접근하고 끝낵고
    // User2 가 접근하므로 속도가 떨어진다. 하지만 데이터의 신뢰성은 보장한다.
    public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        //현재 실행중인 스레드 이름과 memory 값을 출력
        System.out.println(Thread.currentThread().getName() + " : " + this.getMemory());
    }
}
