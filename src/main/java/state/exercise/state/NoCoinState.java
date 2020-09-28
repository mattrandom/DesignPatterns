package state.exercise.state;

public class NoCoinState implements State {

    @Override
    public void insertTheCoin(SlotMachines slotMachines) {
        System.out.println("The coin has been inserted!");
        slotMachines.state = new CoinInsertedState();
    }

    @Override
    public void pullTheLever(SlotMachines slotMachines) {
        System.out.println("Insert the coin to start a playing!");
    }

    @Override
    public void takeTheWinnings(SlotMachines slotMachines) {
        System.out.println("Insert the coin to give yourself a chance to win!");
    }

    @Override
    public void showCurrentState(SlotMachines slotMachines) {
        System.out.println("Current state of the game - ***NO COIN***");
    }
}
