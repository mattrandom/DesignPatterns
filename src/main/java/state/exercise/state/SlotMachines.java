package state.exercise.state;

public class SlotMachines {
    State state;

    public SlotMachines() {
        this.state = new NoCoinState();
    }

    public void insertTheCoin() {
        this.state.insertTheCoin(this);
    }

    public void pullTheLever() {
        this.state.pullTheLever(this);
    }

    public void takeTheWinnings() {
        this.state.takeTheWinnings(this);
    }

    public void showCurrentState() {
        this.state.showCurrentState(this);
    }


}
