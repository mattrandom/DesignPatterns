package command.lesson.workshop.command;

import command.lesson.workshop.Robot;

public class RobotDrillCommand implements Command {
    private Robot robot;

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.drill();
    }

    @Override
    public void undo() {
        System.out.println("#Restoration of the previous state# - The robot is no longer drilling");
    }
}
