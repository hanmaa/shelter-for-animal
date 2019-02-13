package ru.taranov.dto.impl;

import ru.taranov.dto.*;

import java.util.*;

public class Shelter implements Storage {

    private Set<Animal> shelterSet = new HashSet();
    private List<Animal> shelterList = new ArrayList();
    private Map<Integer, Animal> shelterMap = new HashMap();


    public void setShelterSet(Animal animal) {
        shelterSet.add(animal);
    }

    public Set<Animal> getShelterSet() {
        return this.shelterSet;
    }

    public void setShelterList(Animal animal) {
        shelterList.add(animal);
    }

    public List<Animal> getShelterList() {
        return this.shelterList;
    }

    public void setShelterMap(Integer integer, Animal animal) {
        shelterMap.put(integer, animal);
    }

    public Map<Integer, Animal> getShelterMap() {
        return this.shelterMap;
    }

    public String toString(){
        return "In the shelter live "+shelterMap;
    }
}
