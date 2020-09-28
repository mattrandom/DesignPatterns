package state.exercise.state;

import java.util.Random;

public class CoinInsertedState implements State {
    private static final Random RANDOM = new Random();

    @Override
    public void insertTheCoin(SlotMachines slotMachines) {
        System.out.println("The coin has already been inserted!");
    }

    @Override
    public void pullTheLever(SlotMachines slotMachines) {
        System.out.println("Pull the lever to collect the winnings | *** The draw is in progress... ***");
        int result = RANDOM.nextInt(99);
        if (result < 20) {
            System.out.println("Congratulations! You won!");
            slotMachines.state = new ResultOfTheGameState();
        } else {
            System.out.println("We are sorry! Please, try again to grab a victory!");
            slotMachines.state = new NoCoinState();
        }

    }

    @Override
    public void takeTheWinnings(SlotMachines slotMachines) {
        System.out.println("Pull the lever to verify your luck!");
    }

    @Override
    public void showCurrentState(SlotMachines slotMachines) {
        System.out.println("Current state of the game - ***COIN INSERTED***");
    }
}
