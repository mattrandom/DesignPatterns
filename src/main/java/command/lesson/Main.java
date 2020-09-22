package command.lesson;

import command.lesson.workshop.Robot;
import command.lesson.workshop.WorkshopApp;

public class Main {
    public static void main(String[] args) {
        WorkshopApp workshopApp = new WorkshopApp(new Robot());
        workshopApp.run();
    }
}
