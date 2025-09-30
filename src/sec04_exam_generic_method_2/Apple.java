package sec04_exam_generic_method_2;

public class Apple {

    private int key;

    public Apple(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Apple){
            Apple a = (Apple) obj;
            if (this.key == a.key){
                return true;
            }

        }
        return false;
    }

    @Override
    public String toString() {
        return this.key + " ";
    }
}
