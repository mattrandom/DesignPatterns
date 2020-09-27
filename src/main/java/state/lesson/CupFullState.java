package state.lesson;

public class CupFullState implements State {

    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Take a cup before continuing!");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Take a cup before continuing!");
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("The cup of coffee has been picked up!");
        coffeeMachine.state = new NoCoinState();
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Too late. An order has been completed!");
    }
}
