package LMS;

public class Instructor extends User{
    String department;

    public Instructor(String name, String userId, String department) {
        super(name, userId);
        this.department = department;
    }

    @Override
    String getRole() {
        return "교수";
    }
}
