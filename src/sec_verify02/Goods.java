package sec_verify02;

public class Goods {
    private String name;
    private int price,numberOfStock,sold;


    public Goods(String name, int price, int numberOfStock, int sold){
        this.name = name; this.price = price;
        this.numberOfStock = numberOfStock; this.sold = sold;
    }


    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStock() {
        return numberOfStock;
    }

    public int getSold() {
        return sold;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getPrice() + " " + this.getNumberOfStock() + " " + this.getSold();
    }
}
