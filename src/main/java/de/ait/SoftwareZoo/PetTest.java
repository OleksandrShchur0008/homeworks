package de.ait.SoftwareZoo;

public class PetTest {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.makeSound();
        pet = new Cat();
        pet.makeSound();
    }
}
