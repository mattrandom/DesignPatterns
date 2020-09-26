package strategy.lesson;

import strategy.lesson.chef.Chef;

public class Main {
    public static void main(String[] args) {
        // New order - hard-boiled eggs
        Chef chef = new Chef("Gordon Gessler");
        chef.cook(); // order completed successfully

        // Another new order - soft-boiled eggs
        chef.cook(); // order not executed
    }
}
