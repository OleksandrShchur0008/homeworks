package de.ait.softwareZoo;

public class TestPet {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.makeSound();
        pet = new Cat();
        pet.makeSound();
    }
}
