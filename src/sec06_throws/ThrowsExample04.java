package sec06_throws;

public class ThrowsExample04 {

    public static void main(String[] args) {


        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("해당 클래스가 없습니다.");
            e.printStackTrace();

        }catch (Exception a){
            System.out.println("알 수 없는 예외가 발생하였습니다.");
            a.printStackTrace();
        }

    }

    public static void findClass() throws Exception{
        Class class1 = Class.forName("java.lang.String2");
    }

}
