package ru.taranov.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Storage {

    void setShelterSet(Animal animal);
    void setShelterList(Animal animal);
    void setShelterMap(Integer integer, Animal animal);
    Set<Animal> getShelterSet();
    List<Animal> getShelterList();
    Map<Integer, Animal> getShelterMap();
}
