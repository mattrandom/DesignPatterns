package state.lesson;

public class NoCoinState implements State {

    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("The coin has been inserted!");
        coffeeMachine.state = new CoinInsertedState();
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Insert a coin!");
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Insert a coin!");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Insert a coin!");
    }
}
