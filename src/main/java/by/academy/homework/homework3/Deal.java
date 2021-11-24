package by.academy.homework.homework3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

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
    private ArrayList<Product> productsInCart;
    private Product[] products;
    private Product[] productsAfterDeal;
    private BigDecimal fullPrice = BigDecimal.valueOf(0);

    public Deal(Bargainer seller, Bargainer buyer, ArrayList<Product> productsInCart, Product[] products, Product[] productsAfterDeal) {
        this.seller = seller;
        this.buyer = buyer;
        this.productsInCart = productsInCart;
        this.products = products;
        this.productsAfterDeal = productsAfterDeal;
    }

    protected void deal() {
        Scanner scan = new Scanner(System.in);
        if (buyer.getMoney().compareTo(getFullPrice()) >= 0) {
            printBill();
            System.out.println("To confirm the purchase and payment, click yes, to cancel - no");
            String yesOrNo = scan.nextLine();

            while (!yesOrNo.equals("yes") && !yesOrNo.equals("no")) {
                System.out.println("To confirm the purchase and payment, click yes, to cancel - no");
                yesOrNo = scan.nextLine();
            }
            if (yesOrNo.equals("yes")) {
                seller.increaseMoney(fullPrice);
                buyer.decreaseMoney(fullPrice);
                products = productsAfterDeal;
                System.out.println("Deal completed successfully. Would you like to purchase something else?");
                App.printProduct(products);
            } else {
                System.out.println("The deal was canceled by the user");
            }

        } else {
            System.out.println("Not enough money");
        }
        scan.close();
    }

    protected void printBill() {
        for (Product product : productsInCart) {
            System.out.println(product + ": " + product.getQuantityProduct() + "   x   " + product.getCostProduct() +
                    "   x   " + product.getDiscount() + "   =   " + product.getPrice());
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
