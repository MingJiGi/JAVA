package LMS;

public class Student extends User{

    String major;

    public Student(String name, String userId, String major) {
        super(name, userId);
        this.major = major;
    }


    @Override
    String getRole() {
        return "학생";
    }
}
