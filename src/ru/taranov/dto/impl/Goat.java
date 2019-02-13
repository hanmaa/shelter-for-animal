package ru.taranov.dto.impl;

import ru.taranov.dto.Animal;

public class Goat implements Animal {

    private String name;
    private int age;

    public Goat(String name, int age) {
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
        return "Meeeeeeee";
    }

    public String toString() {
        return "goat's name is "+ name+" and his age is "+age;
    }
}
