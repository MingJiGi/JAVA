package Person;

public class StaticOverloadingExample {
    public static void main(String[] args) {

        //static 은 static만 호출할 수 있다.
        int result = add(3,5);
        System.out.println(result);
        StaticOverloadingExample s = new StaticOverloadingExample();
        System.out.println(s.add(10L, 10L)); //인스턴스 메서드 호출

        int [] result2 = new int[] {0}; // 배열을 생성하고 result2[0]의 값을 0으로
        add(3,5, result2); // 배열을 add메서드의 매개변수로 전달
        System.out.println(result2[0]);
    }

    public long add(long a, long b){
        return a+b;
    }
    public static  int add(int a, int b){
        return a+b;
    }

    public static void  add(int a, int b, int [] result){
        result[0] = a+b; // 매개변수로 넘겨받은 배열에 연산결과를 저장
    }
}
