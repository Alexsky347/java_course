package instance_of;

import polymorphism.Animal;
import polymorphism.Dog;

public class isInstance {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        boolean isDog = dog instanceof Dog;
        boolean isAnimal = dog instanceof Animal;
        System.out.println("Is dog: " + isDog);
        System.out.println("Is animal: " + isAnimal);
    }
}
