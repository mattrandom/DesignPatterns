package facade.exercise;

import facade.exercise.bank.AtmMachineFacade;

public class Main {
    public static void main(String[] args) {
        AtmMachineFacade facade = new AtmMachineFacade();
        facade.withdrawMoney();
    }
}
