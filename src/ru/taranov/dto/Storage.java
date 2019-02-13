package ru.taranov.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Storage {

    void setShelterSet(Animal animal);
    void setShelterMap(Integer integer, Animal animal);
    void setShelterList(Animal animal);
    Set<Animal> getShelterSet();
    Map<Integer, Animal> getShelterMap();
    List<Animal> getShelterList();
}
