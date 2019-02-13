package ru.taranov;

import ru.taranov.dto.Animal;
import ru.taranov.dto.impl.*;

import java.util.Map;


public class Main {

    static Shelter shelter = new Shelter();

    static CatAnimal cat = new CatAnimal("Vasya", 3);
    static DogAnimal dog = new DogAnimal("Barya", 2);
    static GoatAnimal goat = new GoatAnimal("Borya", 5);

    public static void main(String[] args) {


        settleAnimal();
        System.out.println(shelter);
        giveVoiceAnimal();
    }

    private static void settleAnimal() {
        shelter.setShelterMap(1, dog);
        shelter.setShelterMap(2, goat);
        shelter.setShelterMap(3, cat);
    }

    private static void giveVoiceAnimal() {
        for(Map.Entry<Integer, Animal> animal : shelter.getShelterMap().entrySet()) {
            System.out.println(animal.getValue().getName() + " says " + animal.getValue().giveVoice());
        }
    }
}
