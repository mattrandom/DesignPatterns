package decorator.example.first;

public class SauceMealDecorator extends MealDecorator {

    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSauce();
    }

    private void addSauce() {
        System.out.println("Sauce is added to a dish.");
    }
}
