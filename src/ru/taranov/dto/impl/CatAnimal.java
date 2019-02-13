package ru.taranov.dto.impl;

import ru.taranov.dto.Animal;

public class CatAnimal implements Animal {

    private String name;
    private int age;

    public CatAnimal(String name, int age) {
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
        return "Meow-Meow";
    }

    public String toString() {
        return "cat's name is "+ name + " and his age is " + age;
    }
}
