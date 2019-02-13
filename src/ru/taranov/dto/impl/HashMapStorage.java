package ru.taranov.dto.impl;

import ru.taranov.dto.Animal;
import ru.taranov.dto.Storage;

import java.util.HashMap;
import java.util.Map;

public class HashMapStorage implements Storage {

    private Map<String, Animal> shelterMap = new HashMap();

    public Map<String, Animal> getShelterMap() {
        return shelterMap;
    }

    public void setShelterMap(Map<String, Animal> shelterMap) {
        this.shelterMap = shelterMap;
    }

    public void addAnimal(Animal animal) {
        shelterMap.put(animal.getName(), animal);
    }

    public void removeAnimal(Animal animal) {
        shelterMap.remove(animal.getName());
    }

    public void giveVoiceAnimal() {
        for(Map.Entry<String, Animal> animal : shelterMap.entrySet()) {
            System.out.println(animal.getValue().getName() + " says " + animal.getValue().giveVoice());
        }
    }

    public String toString(){
        return "In a shelter there live a "+shelterMap;
    }
}