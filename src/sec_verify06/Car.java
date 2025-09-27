package sec_verify06;

public class Car {
    Tire[] tires = new Tire[]{new HankookTire(),new HankookTire(),
    new HankookTire(), new HankookTire(), new KumhoTire(), new KumhoTire(),
    new KumhoTire(), new KumhoTire()};





    public void run(){
        for (Tire r : tires){
            r.roll();
        }
    }
}
