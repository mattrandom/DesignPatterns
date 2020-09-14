package decorator.example.first;

public class RiceMeal extends Meal {

    @Override
    public void prepareMeal() {
        System.out.println("The rice-based dish is being prepared. ");
    }
}
