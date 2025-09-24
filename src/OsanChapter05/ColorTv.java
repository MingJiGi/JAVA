package OsanChapter05;

public class ColorTv extends Tv {
    int modelNum;
    public ColorTv(int size,  int modelNum) {
        super(size);
        this.modelNum = modelNum;
    }

    public void printProperty(){
        System.out.println(super.getSize() + "인치"+this.modelNum + "컬러" );
    }


    public static void main(String[] args) {
        ColorTv colorTv = new ColorTv(65,65536);
        colorTv.printProperty();

    }
}
