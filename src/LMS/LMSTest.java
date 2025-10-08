package LMS;

public class LMSTest {

    public static void main(String[] args) {
        Displayable[] arr = new Displayable[]{new Student("우민식","2024270007","컴퓨터"), new Instructor("안정원","2","컴퓨터")};


        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i].getDisplayInfo());
        }
    }











}
