package ru.taranov.dto.impl;

import ru.taranov.dto.Animal;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatAnimal catAnimal = (CatAnimal) o;
        return age == catAnimal.age &&
                Objects.equals(name, catAnimal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return "cat's name is "+ name + " and his age is " + age;
    }
}
