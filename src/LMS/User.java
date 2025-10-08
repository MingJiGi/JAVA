package LMS;

public abstract class User implements Displayable{

    protected String userId,name;
    abstract String getRole();

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    @Override
    public String getDisplayInfo() {
        return "이름 : " + name + "학번 : " + userId;
    }
}
