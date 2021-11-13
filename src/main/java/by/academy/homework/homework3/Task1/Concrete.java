package by.academy.homework.homework3.Task1;

import java.math.BigDecimal;

public class Concrete extends Product{
    public Concrete (double quantityProduct, BigDecimal costProduct){
        typeProduct="Concrete";
        this.quantityProduct=quantityProduct;
        this.costProduct=costProduct;
    }
}
