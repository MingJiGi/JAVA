package OsanChapter05;

public class SmartTv extends ColorTv {
    String address;
    public SmartTv(String address, int size, int modelNum) {
        super(size, modelNum);
        this.address = address;
    }


    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv("192.168.0.5",77,200000);
        smartTv.printProperty();

    }

    @Override
    public void printProperty() {
        System.out.println("나의 smartTV는 " + this.address +"주소의" +super.getSize() +"인치" + modelNum +"컬러");
    }
}
