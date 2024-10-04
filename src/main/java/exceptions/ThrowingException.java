package exceptions;

public class ThrowingException {
    public static void main(String[] args) throws NegativeInputException {
        calculateArea(-1);
    }

    public static double calculateArea(double radius) throws NegativeInputException {
        if (radius < 0) {
            throw new NegativeInputException("Negative input not allowed");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
