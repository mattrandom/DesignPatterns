package state.exercise.state;

public class ResultOfTheGameState implements State {

    @Override
    public void insertTheCoin(SlotMachines slotMachines) {
        System.out.println("Collect the winning before starting again!");
    }

    @Override
    public void pullTheLever(SlotMachines slotMachines) {
        System.out.println("Collect the winning before starting again!");
    }

    @Override
    public void takeTheWinnings(SlotMachines slotMachines) {
        System.out.println("The winning has been collected :-) | Keep on going to not loose an another chance!");
        slotMachines.state = new NoCoinState();
    }

    @Override
    public void showCurrentState(SlotMachines slotMachines) {
        System.out.println("Current state of the game - ***VICTORY***");
    }
}
