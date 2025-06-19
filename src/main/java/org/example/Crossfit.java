package org.example;

public class Crossfit extends Training{

    private final int averageProjectileWeight;

    public Crossfit(int averagePulse, int duration, Athlete athlete, int averageProjectileWeight) {
        super(averagePulse, duration, athlete);
        this.averageProjectileWeight = averageProjectileWeight;
    }

    @Override
    public void printInfo() {
        StringBuilder builder = new StringBuilder();
        builder
                .append("Кросфіт тренування! ")
                .append("Тривалість: ")
                .append(this.getDuration())
                .append(" хв. Середня вага штанги: ")
                .append(averageProjectileWeight)
                .append(" кг. Кілокалорій: ")
                .append(String.format("%.2f", this.calculateCalorieExpenditure()));
        System.out.println(builder.toString());
    }
}
