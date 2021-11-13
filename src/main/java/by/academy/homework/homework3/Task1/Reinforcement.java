package by.academy.homework.homework3.Task1;

import java.math.BigDecimal;

public class Reinforcement extends Product {
    private double quality;

    public Reinforcement(double quantityProduct, BigDecimal costProduct, double quality) {
        super("Reinforcement", quantityProduct, costProduct);
        this.quality=quality;
    }

    @Override
    protected double getDiscount(double quantityProduct) {
        if (quantityProduct >= 10 && quantityProduct < 100) {
            return 0.985*quality;
        }
        if (quantityProduct >= 100) {
            return 0.95*quality;
        }
        return 1*quality;
    }

}
