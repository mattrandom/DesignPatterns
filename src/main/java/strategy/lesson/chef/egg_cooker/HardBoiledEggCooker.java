package strategy.lesson.chef.egg_cooker;

public class HardBoiledEggCooker implements EggCooker {

    @Override
    public void cookEgg() {
        System.out.println("Let's boil hard-boiled eggs!");
    }
}
