package osan_abstract;
import java.util.Scanner;
abstract class Box{
    protected int size;
    //Box 의 매개변수가 있는 생성자를 만들어 size값을 초기화
    public Box(int size){
        this.size = size;
    }
    //size 값이 0 이면 true 반환
    public boolean isempty() {return size == 0;}
    //추상메소드
    public abstract boolean consume();
    //추상메소드
    public abstract void print();
}
//Box 클래스를 상속받는 클래스
class IngredientBox extends Box{
    private String name;

    // 매개변수가 있는 생성자
    public IngredientBox(String name, int size) {
        //super 클래스에 size 값을 받아서 넘겨줌
        super(size);
        //IngredientBox 의 name 변수에 받은 name 값으로 초기화
        this.name = name;
    }

    //super클래스의 추상메소드인 print 를 재정의
    @Override
    public void print() {
        System.out.println(name + ' ');
        for (int i = 0; i < size; i++) System.out.print("*");
        System.out.println(size);
    }

    //super 클래스의 consume 추상메소드를 재정의
    @Override
    public boolean consume() {
        //size 가 0이면 false 를 반환
        if(size == 0) return false;
        //size 가 0이 아니면 1씩 감소
        size --;
        return true;
    }
}
class CoffeeVendingMachine {
    private String name;
    private IngredientBox coffe = new IngredientBox("커피",5);
    private IngredientBox cream = new IngredientBox("프림",5);
    private IngredientBox sugar = new IngredientBox("설탕",5);
    private Scanner scanner = new Scanner(System.in);
    //매개변수가 있는 생성자 name 값을 받아서 CoffeeVendingMachine 의 필드인 name에 name으로 초기화
    public CoffeeVendingMachine(String name) {
        this.name = name;
    }
    private int getMenu(){
        System.out.print("다방커피 : 1, 설탕커피 : 2, 블랙커피 : 3, 종료 : 4>>");
        int menu = scanner.nextInt();
        return menu;
    }
    //CoffeeVendingMachine 의 고유 메소드
    // 각 객체가 가지고 있는 print() 메소드를 실행)
    private void print() {
        coffe.print();
        cream.print();
        sugar.print();
    }
    public void run(){
        System.out.println("******"+name+"입니다.*****");
        print();
        while (true) {
            int menu = getMenu();
            switch (menu) {
                case 1:
                    //coffe, cream, sugar 가 값이 비엇으면 멈추고 아니면 coffe, cream, sugar 의 size를 하나씩 감소
                    if (coffe.isempty() || cream.isempty() || sugar.isempty()){ System.out.println("원료가 부족합니다"); break;} coffe.consume(); cream.consume(); sugar.consume(); break;
                //  coffe,sugar 가 비엇으면 멈추고 아니면 coffe, sugar 의 size 하나씩 감소
                case 2: if (coffe.isempty() || sugar.isempty()){ System.out.println("원료가 부족합니다"); break;} coffe.consume(); sugar.consume(); break;
                // coffe 가 비엇으면 멈추고 아니면 coffe 의 size를 하나씩 감소
                case 3: if (coffe.isempty()){ System.out.println("원료가 부족합니다"); break;} coffe.consume(); break;
                // while 문 탈출
                case 4: System.out.println(name + "프로그램 종료합니다."); return;
                default: System.out.println("다시 입력하세요"); continue;
            }
            print();
        }
    }
}
public class CoffeeVendingMachineEx{
    public static void main(String[] args) {
        new CoffeeVendingMachine("청춘 커피 자판기").run();
    }
}
