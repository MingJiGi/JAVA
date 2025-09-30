package sec07_user_define_excption_02;

public class SpaceExcption extends  Exception{

    public SpaceExcption() {
    }

    public SpaceExcption(String message) {
        super(message);
    }
}

