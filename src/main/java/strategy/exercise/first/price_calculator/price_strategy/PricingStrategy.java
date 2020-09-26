package strategy.exercise.first.price_calculator.price_strategy;

public interface PricingStrategy {

    void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
