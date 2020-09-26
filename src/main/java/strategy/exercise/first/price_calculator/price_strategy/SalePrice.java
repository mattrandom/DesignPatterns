package strategy.exercise.first.price_calculator.price_strategy;

public class SalePrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter) {
            System.out.println("Discount for newsletter subscribers: " + price / 2);
        } else {
            System.out.println("The newsletter is not subscribed by the user - please use a different pricing strategy to properly complete an order");
        }
    }
}
