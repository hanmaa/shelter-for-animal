package ru.taranov;

import ru.taranov.dto.Animal;
import ru.taranov.dto.impl.*;


public class Main {

    public static void main(String[] args) {
        Shelter shelter = new Shelter();

        Cat cat = new Cat("Vasya", 3);
        Dog dog = new Dog("Barya", 2);
        Goat goat = new Goat("Borya", 5);

        settleAnimal(shelter, cat, dog, goat);
        System.out.println(shelter);
        giveVoiceAnimal(shelter);
    }

    private static void settleAnimal(Shelter shelter, Cat cat,Dog dog, Goat goat) {
        shelter.setStorage(cat);
        shelter.setStorage(dog);
        shelter.setStorage(goat);
    }

    private static void giveVoiceAnimal(Shelter shelter) {
        for (Animal animal:shelter.getStorage()) {
            System.out.println(animal.getName()+" says "+animal.giveVoice());
        }
    }
}
