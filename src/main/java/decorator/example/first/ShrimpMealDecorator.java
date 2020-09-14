package decorator.example.first;

public class ShrimpMealDecorator extends MealDecorator {

    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addShrimp();
    }

    private void addShrimp() {
        System.out.println("Shrimp is added to a dish.");
    }
}
