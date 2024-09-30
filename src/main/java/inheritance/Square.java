package inheritance;

import objects.Rectangle;

public class Square extends Rectangle {
    public Square(double side) {
        super();
    }

    //overriding method
    @Override
    public double calculatePerimeter() {
        return sides * length;
    }

    // overloaded method

    public void print(String message) {
        System.out.println(String.format("I'm a square: %s", message));
    }
}
