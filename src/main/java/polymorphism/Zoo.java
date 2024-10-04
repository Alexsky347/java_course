package polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog = new Cat();
        dog.makeSound();


        // dog.fetch(); // This line will not compile
        Dog dog2 = new Dog();
        dog2.fetch();
        Animal cat = new Cat();
        cat.makeSound();
        // cat.scratch(); // This line will not compile
        Cat cat2 = new Cat();
        cat2.scratch();
    }
}
