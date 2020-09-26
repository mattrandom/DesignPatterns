package strategy.exercise.first;

import strategy.exercise.first.price_calculator.PriceCalculator;
import strategy.exercise.first.price_calculator.price_strategy.RegularPrice;
import strategy.exercise.first.price_calculator.price_strategy.SalePrice;

public class Main {
    public static void main(String[] args) {

        PriceCalculator priceCalculator = new PriceCalculator();

        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, false);
        priceCalculator.calculate(100, true);

        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, false);
        priceCalculator.calculate(100, true);
    }
}
