package pattern_matching;

import polymorphism.Animal;
import polymorphism.Dog;

public class PatternMatching {
    public static void main(String[] args) {
        Animal sasha = new Dog();
        if (sasha instanceof Dog sashaDog) {
            sashaDog.fetch();
        }

        //same as
        if (sasha instanceof Dog) {
            Dog sashaDog = (Dog) sasha;
            sashaDog.fetch();
        }

    }
}
