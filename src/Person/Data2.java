package Person;

public class Data2 {
    int value;
    public Data2(){
        System.out.println("기본생성자 호출");
    };

    //매개변수가 있는 생성자.
    // 기본생성자는 자동으로 생성되지 않음.
    public Data2 (int value){
        //this는 객체 자기자신의 주소를 지니고 있다.(참조변수와 동일)
        //this가 활성화 되는 시점은 new라는 연산자를 통해서 인스턴스가 생성될 때 활성화가 이루어진다.
        this.value = value;
    }

}
