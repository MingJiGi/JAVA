package sec03_exam_multitype_parameter;

public class Car {
    private String brand;
    private int year;
    private int month;

    public Car() {
    }

    public Car(String brand, int month, int year) {
        this.brand = brand;
        this.month = month;
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
