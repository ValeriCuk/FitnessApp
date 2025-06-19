package org.example;

import java.util.Objects;

public class Athlete {

    private String name;
    private int age;
    private double weight;

    public Athlete(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Athlete athlete = (Athlete) o;
        return age == athlete.age && Double.compare(weight, athlete.weight) == 0 && Objects.equals(name, athlete.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    @Override
    public String toString() {
        return "Спортсмен на імʼя " + name
                + ", віком " + age +
                " років та вагою " + weight + ".\n";
    }
}
