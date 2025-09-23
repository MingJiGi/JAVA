package Person;

public class FactorialExample {
    public static void main(String[] args) {

       long result =  factorial(5L);
        System.out.println("Main() result 의 값 : " +result);
    }
    //for문을 사용해도 되나, 코드를 보는 것과 코드 줄임으로써 좋다.
    //과거에는 메모리의 부족으로 재귀함수를 사용하지 않앗으나 현재는 기술의 발전으로 많이 사용.
    public static long factorial(long n){
        long result = 0L;

        if(n == 1){
            result = 1;
        }else{
            result = n * factorial(n-1); // 재귀호출(메서드 자기 자신을 호출)
            System.out.println("result값 : " + result + ", n값 : " + n);
        }

        return result;
    }
}
