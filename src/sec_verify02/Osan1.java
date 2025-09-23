package sec_verify02;

public class Osan1 {
    private static String name, sex, stNum;

    public Osan1(String name, String sex, String stNum){
        this.name = name;
        this.sex = sex;
        this.stNum = stNum;
    }

    public static void setName(String name) {
        Osan1.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void setSex(String sex) {
        Osan1.sex = sex;
    }

    public static String getSex() {
        return sex;
    }

    public static void setStNum(String stNum) {
        Osan1.stNum = stNum;
    }

    public static String getStNum() {
        return stNum;
    }
}
