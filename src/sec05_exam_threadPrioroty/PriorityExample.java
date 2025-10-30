package sec05_exam_threadPrioroty;

public class PriorityExample {

    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            Thread thread = new CalcThread("Thread : " + i);
            if (i != 10){
                // 우선 순위가 1로써 가장 낮다.
                thread.setPriority(Thread.MIN_PRIORITY);
            }else {
                // 우선순위가 10으로써 가장 높다.
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }
    //아무리 우선순위를 10으로 주었다 하나. 마치는 빈도가 높을뿐이지 꼭 먼저 작업을
    // 끝낸다고는 보장 못한다. 어차피 자바는 순환할당방식(Round-Robin)을 실행하므로,
    // CPU의 스케줄러 상태에 따라 달라진다.)
}
