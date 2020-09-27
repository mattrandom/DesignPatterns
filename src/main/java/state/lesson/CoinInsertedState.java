package state.lesson;

public class CoinInsertedState implements State {

    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("The coin has already been inserted!");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("I pour a coffee!");
        coffeeMachine.state = new CupFullState();
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Push the button!");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Return the coin!");
        coffeeMachine.state = new NoCoinState();
    }
}
