package org.example;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Athlete athlete = new Athlete("Ron", 25, 80);

        Training runMonday = new Running(120, 35, athlete, 3);
        Training runWednesday = new Running(130, 40, athlete, 2);
        Training runFriday = new Running(115, 55, athlete, 5);

        Training crossTuesday = new Crossfit(110, 60, athlete, 5);
        Training crossThursday = new Crossfit(95, 60, athlete, 10);

        Training boxingSaturday = new Boxing(130, 120, athlete);

        List<Training> trainings = List.of(runMonday, runWednesday, runFriday, crossTuesday, crossThursday, boxingSaturday);

        trainings.forEach(Training::printInfo);
    }
}