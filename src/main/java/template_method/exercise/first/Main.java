package template_method.exercise.first;

public class Main {
    public static void main(String[] args) {

        Weekday scheduleOfTheDay = new OrdinaryDay();
        scheduleOfTheDay.sameShitDifferentDay(TransportType.BIKE);

    }
}

