package ru.taranov.dto.impl;

import ru.taranov.dto.Animal;
import ru.taranov.dto.Storage;

import java.util.HashSet;
import java.util.Set;

public class HashSetStorage implements Storage {

    private Set<Animal> shelterSet = new HashSet();

    public Set<Animal> getShelterSet() {
        return shelterSet;
    }

    public void setShelterSet(Set<Animal> shelterSet) {
        this.shelterSet = shelterSet;
    }

    public void addAnimal(Animal animal) {
        shelterSet.add(animal);
    }
    public void removeAnimal(Animal animal) {
        shelterSet.remove(animal.getName());
    }

    public void giveVoiceAnimal() {
        for(Animal animal : shelterSet) {
            System.out.println(animal.getName() + " says " + animal.giveVoice());
        }
    }

    public String toString(){
        return "In a shelter there live a "+shelterSet;
    }
}
