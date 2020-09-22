package command.lesson.workshop.command;

import command.lesson.workshop.Robot;

public class RobotCutCommand implements Command {
    private Robot robot;

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.cut();
    }

    @Override
    public void undo() {
        System.out.println("#Restoration of the previous state# - The robot is no longer cutting");
    }
}
