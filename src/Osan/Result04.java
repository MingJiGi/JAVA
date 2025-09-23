package Osan;

public class Result04 {
    double value = 3.4;

    public double getValue(){
        return value;
    }
    public void setValue(double value){
        this.value = value;
    }
    public  double add (double value){
        return this.value += value;

    }

    public static void main(String[] args) {
        Result04 rs = new Result04();
        rs.setValue(7.3);
        rs.add(2.7);
        System.out.println(rs.getValue());
    }
}
