package strategy.lesson.chef.egg_cooker;

public class SoftBoiledEggCooker implements EggCooker {

    @Override
    public void cookEgg() {
        System.out.println("Let's boil soft-boiled eggs!");
    }
}
