package org.example;

import java.util.Objects;

public abstract class Training {

    private final int averagePulse;
    private final int duration;
    private final Athlete athlete;

    public Training(int averagePulse, int duration, Athlete athlete) {
        this.averagePulse = averagePulse;
        this.duration = duration;
        this.athlete = athlete;
    }

    public double calculateCalorieExpenditure() {
        return 0.014 * athlete.getWeight() * duration * (0.12 * averagePulse - 7);
    }

    public abstract void printInfo();

    protected int getAveragePulse() {
        return averagePulse;
    }

    protected int getDuration() {
        return duration;
    }

    protected Athlete getAthlete() {
        return athlete;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Training training = (Training) o;
        return averagePulse == training.averagePulse && duration == training.duration && Objects.equals(athlete, training.athlete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averagePulse, duration, athlete);
    }

    @Override
    public String toString() {
        return "Середній пульс: " + averagePulse + "уд/хв. Тривалість: " + duration +
                "хв. Вага спортсмена: " + athlete.getWeight() + ".";
    }
}
