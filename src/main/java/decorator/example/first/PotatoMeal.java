package decorator.example.first;

public class PotatoMeal extends Meal {

    @Override
    public void prepareMeal() {
        System.out.println("The potato-based dish is being prepared. ");
    }
}
