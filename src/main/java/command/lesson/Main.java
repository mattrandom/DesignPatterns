package command.lesson;

import command.lesson.workshop.*;
import command.lesson.workshop.command.*;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot(); // receiver
        Command robotOn = new RobotTurnOnCommand(robot); // concrete command
        Command robotCut = new RobotCutCommand(robot);
        Command robotDrill = new RobotDrillCommand(robot);
        Command robotOff = new RobotTurnOffCommand(robot);

        WorkshopApp workshopApp = new WorkshopApp(); // invoker
        workshopApp.addToQueue(robotOn);
        workshopApp.addToQueue(robotCut);
        workshopApp.addToQueue(robotDrill);
        workshopApp.addToQueue(robotOff);

        workshopApp.run();
        System.out.println("-------------------");
        workshopApp.undoLastCommand();
        System.out.println("-------------------");

        CoffeeMaker coffeeMaker = new CoffeeMaker(); // another sample receiver
        workshopApp.addToQueue(new CoffeeMakerTurnOnCommand(coffeeMaker));
        workshopApp.addToQueue(new CoffeeMakerTurnOffCommand(coffeeMaker));
        workshopApp.run();
        System.out.println("-------------------");
        workshopApp.undoLastCommand();

    }
}
