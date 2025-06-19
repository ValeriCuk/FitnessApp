package org.example;

public class Running extends Training {

    private final int distance;

    public Running(int averagePulse, int duration, Athlete athlete, int distance) {
        super(averagePulse, duration, athlete);
        this.distance = distance;
    }

    @Override
    public void printInfo() {
        StringBuilder builder = new StringBuilder();
        builder
                .append("Бігове тренування! ")
                .append("Тривалість: ")
                .append(this.getDuration())
                .append(" хв. Дистанція: ")
                .append(distance)
                .append(" км. Кілокалорій: ")
                .append(this.calculateCalorieExpenditure());
        System.out.println(builder.toString());
    }
}
