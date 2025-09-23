package sec_verify02;

public class Korean {
    String nation,name,character;
    int height,age;
    public Korean(){};
   public Korean(String nation, String name, int height, int age, String character){
        this.nation = nation;
        this.name = name;
        this.height = height;
        this.age = age;
        this.character = character;
    }


    @Override
    public String toString() {
        return "\n국적 : " + nation +"\n이름 : " + name + "\n키 : " + height + "\n나이 : " + age+ "\n특징 : " + character;
    }
}
