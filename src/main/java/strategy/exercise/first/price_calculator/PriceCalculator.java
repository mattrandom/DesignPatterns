package strategy.exercise.first.price_calculator;

import strategy.exercise.first.price_calculator.price_strategy.PricingStrategy;

public class PriceCalculator {
    private PricingStrategy pricingStrategy;

    public void calculate(int price, boolean isSignedUpForNewsletter) {
        this.pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}
