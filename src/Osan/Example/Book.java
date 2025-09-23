package Osan.Example;

public class Book {
    String title, author;
    public Book(String t){
        this(t, "작자미상");
        System.out.println("생성자 호출됨");
    }
    public Book(String t, String a){
        title = t;
        author = a;
    }
    public void show(){
        System.out.println(title+ " " + author);

    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생택쥐페리");
        Book loveStory = new Book("춘향전");
        loveStory.show();
    }
}
