package by.academy.homework.homework3;

import java.math.BigDecimal;
import java.util.ArrayList;
/*
Класс Deal позволяет реализовать сделку между 2 пользователями (Bargainer seller и Bargainer buyer).
Пользователи Bargainer seller и Bargainer buyer обладают свойствами: имя, количество денег.
Предполагается, что перед сделкой Bargainer seller имеет в наличии все продукты, созданные в классе Product
и его наследниках.
Класс Deal содержит методы:
deal - проведение сделки
printBill - печать чека
getFullPrice - получение суммы сделки
 */
public class Deal {
    private Bargainer seller;
    private Bargainer buyer;
//    private Product[] products;
    private ArrayList<Product> productsInCart;
    private BigDecimal fullPrice = BigDecimal.valueOf(0);

    public Deal(Bargainer seller, Bargainer buyer, ArrayList<Product> productsInCart) {
        this.seller = seller;
        this.buyer = buyer;
        this.productsInCart = productsInCart;
    }

    protected void deal() {
        if (buyer.getMoney().compareTo(getFullPrice()) >= 0) {
            seller.increaseMoney(fullPrice);
            buyer.decreaseMoney(fullPrice);
            printBill();
        } else {
            System.out.println("Not enough money");
        }
    }

    protected void printBill() {
        for (Product product : productsInCart) {
            System.out.println(product + ": " + product.getQuantityProduct() + "   x   " + product.getCostProduct() + "   x   "
                    + product.getDiscount() + "   =   " + product.getPrice());
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println(fullPrice);
    }

    protected BigDecimal getFullPrice() {
        for (Product product : productsInCart) {
            fullPrice = fullPrice.add(product.getPrice());
        }
        return fullPrice;
    }
}
