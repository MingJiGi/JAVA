package sec04_exam_Polymorpshim;

public class computer extends Product{

    //조상클래스의 매개변수가 있는 생성자 Product(int price) 를 호출
    public computer(){
        super(100);
    }


    @Override
    public String toString() {
        return "Computer";
    }
}
