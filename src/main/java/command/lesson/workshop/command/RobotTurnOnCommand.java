package command.lesson.workshop.command;

import command.lesson.workshop.Robot;

// Concrete Command
public class RobotTurnOnCommand implements Command {
    private Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOn();
    }

    @Override
    public void undo() {
        robot.turnOff();
    }
}
