package ru.taranov.dto.impl;

import ru.taranov.dto.Animal;

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

    public String toString() {
        return "dog's name is "+ name + " and his age is " + age;
    }
}
