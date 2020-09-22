package command.lesson.workshop;

import command.lesson.workshop.command.Command;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class WorkshopApp {
    private List<Command> commandQueue = new ArrayList<>();

    public void addToQueue(Command command) {
        commandQueue.add(command);
    }

    public void undoLastCommand() {
//        if (commandQueue.isEmpty()) {
//            System.out.println("The queue does not contain any COMMANDs!");
//        }

        for (Command command : commandQueue) {
            command.undo();
        }
    }

    public void run() {
        if (commandQueue.isEmpty()) {
            System.out.println("The queue does not contain any COMMANDs to run!");
        }

        for (Command command : commandQueue) {
            command.execute();
        }

//        commandQueue.clear();
    }
}
