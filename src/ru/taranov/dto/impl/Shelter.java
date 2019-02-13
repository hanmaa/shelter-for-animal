package ru.taranov.dto.impl;

import ru.taranov.dto.*;

import java.util.HashSet;
import java.util.Set;

public class Shelter implements Storage {

    private Set<Animal> shelter = new HashSet();

    public void setStorage(Animal animal) {
        shelter.add(animal);
    }

    public Set<Animal> getStorage() {
        return this.shelter;
    }

    public String toString(){
        return "In the shelter live "+shelter;
    }
}
