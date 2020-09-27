package state.lesson;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.insertCoin();
        coffeeMachine.returnTheCoin();
        coffeeMachine.pushTheButton();
        coffeeMachine.takeTheCup();
    }
}
