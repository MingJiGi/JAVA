package Osan.Example;

public class Pizza1 {
    private String toppings;
    static int count = 0;

    public Pizza1(String toppings){
        this.toppings = toppings;
        count++;
    }

    public static void main(String[] args) {
        Pizza1 p1 = new Pizza1("super Supream");
        Pizza1 p2 = new Pizza1("cheese");
        Pizza1 p3 = new Pizza1("pepperoni");

        int n = Pizza1.count;
        System.out.println("지금까지 판매된 피자 개수 = " + n);
    }
}
