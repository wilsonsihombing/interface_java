package driver;

import java.util.Scanner;

import model.Enum_animal;
import model.Animal;



public class AnimalDriver {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Choose an animal (DOG, CAT, or COW):");
      String input = scanner.nextLine();

      Enum_animal animalFactory = new Enum_animal();
      Animal animal = animalFactory.createAnimal(input);

      if (animal != null) {
        System.out.print("The animal says: ");
        animal.makeSound();
      } else {
        System.out.println("Unknown animal");
      }

      scanner.close();
  }
}
