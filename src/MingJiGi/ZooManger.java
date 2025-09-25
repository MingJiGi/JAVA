package MingJiGi;


import java.util.Vector;

public class ZooManger {

    static Vector<Animal> a = new Vector<Animal>();

    public static void main(String[] args) {

        a.add(new dog("강아지"));
        a.add(new Cat("고양이"));
        a.add(new Lion("사자"));

        for (int i = 0; i < a.size(); i++) {
            a.get(i).makeSound();
        }

        print(new dog("강아지"), "사료");
        print(new Cat("고양이"), "생선");
        print(new Lion("사자"), "고기");



    }




    public static void print(Feedable p, String food){
        p.feed(food);
    }
}
