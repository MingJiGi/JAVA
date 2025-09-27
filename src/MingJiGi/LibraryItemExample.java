package MingJiGi;

public class LibraryItemExample {
    public static void main(String[] args) {
        LibraryItem[] item = new LibraryItem[]{new Book("꿈의해석"), new DVD("게드전기"), new Magazine("토토로")};


        for (int i = 0; i < item.length; i++) {
            item[i].borrow();
        }
        for (int i = 0; i < item.length; i++) {
            item[i].returnItem();
        }
        DVD a = (DVD)item[1];
        Book b = (Book) item[0];
        Magazine c = (Magazine) item[2];

        a.Reserable(a);
        b.Reserable(b);
        c.Reserable(c);

    }
}
