package MingJiGi;

public abstract class LibraryItem {
    String title; // 제목

    public LibraryItem(String title) {
        this.title = title;
    }

    public abstract void borrow(); // 대출
    public abstract void returnItem(); // 반남

    public String getTitle(){
        return this.title;
    }

}
