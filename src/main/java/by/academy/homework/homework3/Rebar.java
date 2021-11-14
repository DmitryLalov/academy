package by.academy.homework.homework3;

import java.math.BigDecimal;

/*
Класс Rebar (арматура) унаследован от класса Product. Имеет дополнительное свойство quality и переопределенный
метод getDiscount, который при определении скидки учитывает параметр quality (качество).
 */
public class Rebar extends Product {
    protected static double quality;

    public Rebar(double quantityProduct, BigDecimal costProduct) {
        super("rebar", quantityProduct, costProduct);
    }

    public Rebar(double quantityProduct, BigDecimal costProduct, double quality) {
        super("rebar", quantityProduct, costProduct);
        this.quality = quality;
    }

    @Override
    protected double getDiscount() {
        if (getQuantityProduct() >= 10 && getQuantityProduct() < 100) {
            return 0.985 * quality;
        }
        if (getQuantityProduct() >= 100) {
            return 0.95 * quality;
        }
        return 1 * quality;
    }

}
