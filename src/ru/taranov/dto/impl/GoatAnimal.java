package ru.taranov.dto.impl;

import ru.taranov.dto.Animal;

import java.util.Objects;

public class GoatAnimal implements Animal {

    private String name;
    private int age;

    public GoatAnimal(String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoatAnimal that = (GoatAnimal) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return "goat's name is "+ name + " and his age is " + age;
    }
}
