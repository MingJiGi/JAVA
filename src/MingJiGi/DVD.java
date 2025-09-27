package MingJiGi;


public class DVD extends LibraryItem implements Reservable {

    public DVD(String title) {
        super(title);
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println(this.title + "를 대출하셧습니다.");
    }

    @Override
    public void returnItem() {
        System.out.println(this.title + "를 반납하셧습니다.");
    }

    @Override
    public void Reserable(Reservable p) {
        if (p instanceof Book){
            System.out.println("예약가능");
        }else if(p instanceof DVD){
            System.out.println("예약가능");
        }else System.out.println("에약불가능");
    }
}
