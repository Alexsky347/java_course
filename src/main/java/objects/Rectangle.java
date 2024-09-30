package objects;

import inheritance.ProtectedTest;

public class Rectangle {
    private double width;
    protected double length;
    protected int sides = 4;

    protected double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    double calculateArea() {
        return length * width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public void print() {
        System.out.println("I'm a rectangle");
    }

    public void testSome(){
        var protectedTest = new ProtectedTest();
        //not allowed because not in same package and not extending ProtectedTest
        // protectedTest.notAllowedOutsidePackage();
        protectedTest.main(new String[0]);
    }
}
