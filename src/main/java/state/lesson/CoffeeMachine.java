package state.lesson;

public class CoffeeMachine {
    State state;

    public CoffeeMachine() {
        state = new NoCoinState();
    }

    public void insertCoin() {
        state.insertTheCoin(this);
    }

    public void pushTheButton() {
        state.pushTheButton(this);
    }

    public void takeTheCup() {
        state.takeTheCup(this);
    }

    public void returnTheCoin() {
        state.returnTheCoin(this);
    }
}