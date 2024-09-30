package inheritance;

import objects.Rectangle;

public class InheritanceTester {

    public static void main(String[] args) {
        var person = new Person("John Doe");
        person.setAge(25);

        var employee = new Employee();
        employee.setName("John Doe");
        employee.setAge(30);
        employee.setGender("male");
        employee.setEmployeeId("123");
        employee.setTitle("Manager");
        System.out.println(employee.getName() + " is a " + employee.getTitle() + " and is " + employee.getAge() + " years old");

        var square = new Square(5);
        square.setLength(25);
        square.calculatePerimeter();
        System.out.println("Square Perimeter: " + square.calculatePerimeter());

        var rectangle = new Rectangle();
        rectangle.print();

        square.print("Enjoy your day!");
    }
}
