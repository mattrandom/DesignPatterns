package strategy.exercise.first.price_calculator.price_strategy;

public class RegularPrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter) {
            System.out.println("Regular price: " + price);
        } else {
            System.out.println("The newsletter is subscribed by the user - please use a different pricing strategy to properly complete an order");
        }
    }
}
