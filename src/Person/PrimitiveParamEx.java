package Person;

public class PrimitiveParamEx {
    //CallByValue
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() x = " + d.x);
        //ex) 몇시인지 물어보는 형태와 유사
        PrimitiveParamEx.change(d.x);
        System.out.println("change(d.x)메서드 호출 후");
        System.out.println("main() : x = " + d.x);
    }
    public static void change(int x){
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
