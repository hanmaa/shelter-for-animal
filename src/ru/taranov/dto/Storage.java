package ru.taranov.dto;

import java.util.Set;

public interface Storage {

    void setStorage(Animal animal);
    Set<Animal> getStorage();
}
