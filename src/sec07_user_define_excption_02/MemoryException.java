package sec07_user_define_excption_02;

public class MemoryException extends Exception{
    public MemoryException() {}

    public MemoryException(String message) {
        super(message);
    }
}

