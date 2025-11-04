package sec17_exam04_thread_pool_external_object;

//공유객체
//submit(runnable, V result) 메서드를 활용하기 위해서 공유객체
public class Result {

    int accumValue;
    // 공유객체이기 때문 즉, 여러 스레드가 접근하여 사용할 수 있으므로 동기화가 필수적이다.
    public synchronized void addValue(int accumValue){
        this.accumValue += accumValue;
    }

    public synchronized int getAccumValue() {
        return accumValue;
    }
}
