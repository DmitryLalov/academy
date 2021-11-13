package by.academy.homework.homework3.Task1;

import java.math.BigDecimal;

public class Deal {
    Bargainer seller;
    Bargainer buyer;
    Product[] products;
    BigDecimal fullPrice=BigDecimal.valueOf(0);

    public Deal(Bargainer seller, Bargainer buyer, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
    }

    public void deal() {
        printBill();
    }

    public void printBill() {
        for (Product product : products) {
            System.out.println(product + ": "+product.getQuantityProduct()+"   x   "+product.getCostProduct()+"   x   "+product.getDiscount(product.getQuantityProduct())+"   =   " + product.getPrice());
        }
        System.out.println("-----------------------------------------");
        System.out.println(getFullPrice());
    }

    public BigDecimal getFullPrice() {
        for (Product product : products) {
            fullPrice = fullPrice.add(product.getPrice());
        }
        return fullPrice;
    }

}
