package by.academy.homework.homework3;

import java.math.BigDecimal;
/*
Класс Concrete (бетон) унаследован от класса Product. Пока не имеет собственных свойств и методов.
 */
public class Concrete extends Product {
    public Concrete(double quantityProduct, BigDecimal costProduct) {
        super("concrete", quantityProduct, costProduct);
    }
}
