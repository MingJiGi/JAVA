package Osan;

public class Book2 {
    String title, author;
    public Book2(){
        this("미상","미상");
        System.out.println("기본생성자 호출");
    }
    public Book2(String title) {
        this(title, "미상");
    }
    public Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public static void main(String[] args) {
        Book2 littlePrince = new Book2("어린왕자", "생텍쥐페리");
        Book2 loveStory = new Book2("춘향전");
        Book2 emptyBook = new Book2();
        System.out.println(littlePrince);
        System.out.println(loveStory);
        System.out.println(emptyBook);
    }
    @Override
    public String toString() {
        return title + " " + author;
    }
}
