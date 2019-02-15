package ru.taranov;

import ru.taranov.dto.Storage;
import ru.taranov.dto.impl.*;


public class Main {

    static Storage storage = new HashMapStorage();

    static CatAnimal cat = new CatAnimal("Vasya", 3);
    static DogAnimal dog = new DogAnimal("Barya", 2);
    static GoatAnimal goat = new GoatAnimal("Borya", 5);

    public static void main(String[] args) {
        settleAnimal();
        System.out.println(storage);
    }

    private static void settleAnimal() {
        storage.addAnimal(cat);
        storage.addAnimal(cat);
        storage.addAnimal(dog);
        storage.addAnimal(goat);
    }
}
