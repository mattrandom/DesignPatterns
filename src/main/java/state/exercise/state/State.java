package state.exercise.state;

public interface State {

    void insertTheCoin(SlotMachines slotMachines);

    void pullTheLever(SlotMachines slotMachines);

    void takeTheWinnings(SlotMachines slotMachines);

    void showCurrentState(SlotMachines slotMachines);
}
