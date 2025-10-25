package test;

public class ConstructorExample {
    int x;
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
    public ConstructorExample (int x){
        this.x = x;
    }
    public ConstructorExample(){}

    public static void main(String[] args) {
        ConstructorExample a = new ConstructorExample();
        int n = a.getX();
    }
}
