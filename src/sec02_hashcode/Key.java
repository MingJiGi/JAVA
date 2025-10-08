package sec02_hashcode;

import java.util.Objects;

public class Key {

    int number;

    public Key(int number) {
        this.number = number;
    }


    @Override
    public boolean equals(Object o) {
        System.out.println("equals() 호출");
        if (o instanceof Key){
            Key key = (Key) o;
            if (this.number == key.number){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode() 호출 ");
        return this.number;
    }
}
