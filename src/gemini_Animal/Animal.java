package gemini_Animal;

public abstract class Animal implements Adoptable{
    protected  String name;
    protected  int age;
    protected boolean isAdopted;

    public Animal(int age, boolean isAdopted, String name) {
        this.age = age;
        this.isAdopted = isAdopted;
        this.name = name;
    }

    abstract String getSpeciesInfo();

    @Override
    public String greet() {
        return "안녕하세요 저는["+this.name+"] 입니다.";
    }
}
