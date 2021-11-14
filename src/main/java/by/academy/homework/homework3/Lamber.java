package by.academy.homework.homework3;

import java.math.BigDecimal;
/*
Класс Lamber (пиломатериал) унаследован от класса Product. Пока не имеет собственных свойств и методов.
 */
public class Lamber extends Product {
    public Lamber(double quantityProduct, BigDecimal costProduct) {
        super("lamber", quantityProduct, costProduct);
    }
}
