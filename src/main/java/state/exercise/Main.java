package state.exercise;

import state.exercise.state.SlotMachines;

public class Main {
    public static void main(String[] args) {
        SlotMachines context = new SlotMachines();
        context.insertTheCoin();
        context.pullTheLever();
        context.takeTheWinnings();
        context.showCurrentState();
    }
}
