package model;
import java.util.Scanner;

public class Enum_animal {
    public Animal createAnimal(String type) {
        switch (type.toUpperCase()) {
            case "DOG":
                return new Dog();
            case "CAT":
                return new cat();
            case "COW":
                return new Cow();
            default:
                return null;
        }
    }
}
