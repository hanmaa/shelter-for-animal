package ru.taranov.dto.impl;

import ru.taranov.dto.Animal;
import ru.taranov.dto.Storage;

import java.util.ArrayList;
import java.util.List;

public class ListStorage implements Storage {

    private List<Animal> shelterList = new ArrayList();

    public List<Animal> getShelterList() {
        return shelterList;
    }

    public void setShelterList(List<Animal> shelterList) {
        this.shelterList = shelterList;
    }

    public void addAnimal(Animal animal) {
        shelterList.add(animal);
    }

    public void removeAnimal(Animal animal) {
        shelterList.remove(animal.getName());
    }

    public void giveVoiceAnimal() {
        for(Animal animal : shelterList) {
            System.out.println(animal.getName() + " says " + animal.giveVoice());
        }
    }

    public String toString(){
        return "In a shelter there live a "+shelterList;
    }
}
