package state.lesson;

public class CoffeeMachine {

    State state;

    public CoffeeMachine() {
        state = State.NO_COIN;
    }

    public void insertCoin() {
        switch (state) {
            case NO_COIN:
                System.out.println("The coin has been tossed in!");
                state = State.COIN_INSERTED;
                break;
            case COIN_INSERTED:
                System.out.println("The coin has already been tossed in!");
                break;
            case CUP_FULL:
                System.out.println("Take a cup before you'd toss a coin in!");
                break;
        }

    }

    public void pushTheButton() {
        switch (state) {
            case NO_COIN:
                System.out.println("No coin!");
                break;
            case COIN_INSERTED:
                System.out.println("I pour coffee!");
                state = State.CUP_FULL;
                break;
            case CUP_FULL:
                System.out.println("Take a cup before you'd toss a coin in!");
                break;
        }
    }

    public void takeTheCup() {
        switch (state) {
            case NO_COIN:
                System.out.println("No coin!");
                break;
            case COIN_INSERTED:
                System.out.println("Push the button!");
                break;
            case CUP_FULL:
                System.out.println("The cup of coffee has been picked up!");
                state = State.NO_COIN;
                break;
        }
    }

    public void returnTheCoin() {
        switch (state) {
            case NO_COIN:
                System.out.println("No coin!");
                break;
            case COIN_INSERTED:
                System.out.println("Return the coin!");
                state = State.NO_COIN;
                break;
            case CUP_FULL:
                System.out.println("Too late!!");
                break;
        }
    }

    public enum State {
        NO_COIN, COIN_INSERTED, CUP_FULL;
    }
}