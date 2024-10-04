package exceptions;

public class NegativeInputException extends Exception {
    public NegativeInputException() {
        this("Negative input not allowed");
    }
    public NegativeInputException(String message) {
        super(message);
    }
}
