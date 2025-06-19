package org.example;

public class Boxing extends Training{

    public Boxing(int averagePulse, int duration, Athlete athlete) {
        super(averagePulse, duration, athlete);
    }

    @Override
    public void printInfo(){
        StringBuilder builder = new StringBuilder();
        builder
                .append("Тренування з кікбоксингу! ")
                .append("Тривалість: ")
                .append(this.getDuration())
                .append(" хв. Кілокалорій: ")
                .append(String.format("%.2f", this.calculateCalorieExpenditure()));
        System.out.println(builder.toString());
    }
}
