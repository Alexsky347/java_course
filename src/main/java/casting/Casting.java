package casting;

import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;

public class Casting {
    public static void main(String[] args) {
            Dog rocky = new Dog();

            Animal sasha = new Dog();

            sasha = new Cat();
            sasha.makeSound();
            ((Cat) sasha).scratch(); // This line will not compile if not casting

            //((Dog) sasha).fetch(); // no compilation error but error at runtime - they are not siblings
            ((Animal) rocky).makeSound(); // is ok because higher three dependency
    }
}
