package strategy.lesson;

import strategy.lesson.chef.Chef;
import strategy.lesson.chef.egg_cooker.EggCooker;
import strategy.lesson.chef.egg_cooker.HardBoiledEggCooker;
import strategy.lesson.chef.egg_cooker.SoftBoiledEggCooker;

public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef("Gordon Gessler");

        // New order - hard-boiled eggs
        EggCooker hardBoiledEggs = new HardBoiledEggCooker();
        chef.setEggCooker(hardBoiledEggs);
        chef.cook();

        // Another new order - soft-boiled eggs
        EggCooker softBoiledEggs = new SoftBoiledEggCooker();
        chef.setEggCooker(softBoiledEggs);
        chef.cook();
    }
}
