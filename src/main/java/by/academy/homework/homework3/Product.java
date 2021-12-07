package by.academy.homework.homework3;

import java.math.BigDecimal;

/*
Здесь находится описание продуктов. Все поля и методы стандартные, за что отвечают понятно по названию.
 */
public class Product implements Cloneable{
    private String typeProduct;
    private double quantityProduct;
    private BigDecimal costProduct = new BigDecimal(0.0);

    public Product() {

    }

    public Product clone(){
        return clone();
    }

    public Product(String typeProduct, double quantityProduct, BigDecimal costProduct) {
        this.typeProduct = typeProduct;
        this.quantityProduct = quantityProduct;
        this.costProduct = costProduct;
    }

    protected String getTypeProduct() {
        return typeProduct;
    }

    protected double getQuantityProduct() {
        return quantityProduct;
    }

    protected BigDecimal getCostProduct() {
        return costProduct;
    }

    protected double getDiscount() {
        if (quantityProduct >= 10 && quantityProduct < 100) {
            return 0.985;
        }
        if (quantityProduct >= 100) {
            return 0.95;
        }
        return 1;
    }

    protected BigDecimal getPrice() {
        return costProduct.multiply(BigDecimal.valueOf(quantityProduct)).multiply(BigDecimal.valueOf(getDiscount()));
    }
    protected void setDecreaseQuantityProduct(double quantityProductInCart){
        quantityProduct-=quantityProductInCart;
    }

    protected double getQuantityProductInCart() {
        return quantityProduct;
    }


    @Override
    public String toString() {
        return "" + typeProduct;
    }
}
