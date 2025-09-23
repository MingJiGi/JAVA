package sec_verify02;

public class Product {

    static int count = 0;
    int serialNo;

    //인스턴스 초기화 블럭(new 라는 연산자가 실행될 때 마다 호출)
    {
        ++count;
        this.serialNo = count;
        System.out.println("인스턴스 초기화 블럭 호출");
    }
    //정적 초기화 블럭 (단, 한번 수행)
    static {
        System.out.println("정적 초기화 블럭 호출");
    }
    public Product(){
        System.out.println("기본생성자 호출");
    }
}
