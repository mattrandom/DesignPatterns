package command.lesson.workshop.command;

import command.lesson.workshop.CoffeeMaker;

public class CoffeeMakerTurnOffCommand implements Command {
    private CoffeeMaker coffeeMaker;

    public CoffeeMakerTurnOffCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOff();
    }

    @Override
    public void undo() {
        coffeeMaker.turnOn();
    }
}
