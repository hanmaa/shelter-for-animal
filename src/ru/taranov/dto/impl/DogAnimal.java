package ru.taranov.dto.impl;

import ru.taranov.dto.Animal;

import java.util.Objects;

public class DogAnimal implements Animal {

    private String name;
    private int age;

    public DogAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String giveVoice() {
        return "WOOF-WOOF";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DogAnimal dogAnimal = (DogAnimal) o;
        return age == dogAnimal.age &&
                Objects.equals(name, dogAnimal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return "dog's name is "+ name + " and his age is " + age;
    }
}
