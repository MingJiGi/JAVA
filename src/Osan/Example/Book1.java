package Osan.Example;

public class Book1 extends Object{
    String title, author;
    public Book1(String title){
        this.title = title;
        this.author = "작자미상";

    }
    public Book1(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void show(){
        System.out.println(this.title + " " + this.author);
    }
    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");

        littlePrince.show();
        loveStory.show();
    }


}
