package sec04_exam_Polymorpshim;

public class Tv extends Product{

    //조상클래스의 매개변수가 있는 생성자 Product(int price) 를 호출
    public Tv(){
        super(300);
    }


    @Override
    public String toString() {
        return "Tv";
    }
}
