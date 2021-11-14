package by.academy.homework.homework3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        createDeal(createProduct());               //Создание сделки. Внутри сначала создается массив продуктов,
                                                   // которым владеет пользователь Bargainer seller
    }
/*
Метод createProduct создает изначальные массив продуктов
 */
    protected static Product[] createProduct() {
        int numberOfProduct = 3;
        Product[] products = new Product[numberOfProduct];
        products[0] = new Rebar(1000, BigDecimal.valueOf(2000), 0.5);
        products[1] = new Concrete(100, BigDecimal.valueOf(120));
        products[2] = new Lamber(500, BigDecimal.valueOf(800));
        return products;
    }
    /*
    Метод createDeal создает сделку и проводит ее, если это возможно (у покупателя достаточно денег,
    у продавца достаточно продукта. В случае совершения сделки у пользователей изменяется только количество денег в
    соответствии с суммой сделки. Количество имеющихся у них продуктов пока (!!!) не изменяется.
     */
    protected static void createDeal(Product[] products) {
        ArrayList<Product> productsInCart = new ArrayList<>(products.length);
        double quantityOfProductInCart = 0;
        System.out.println("Available products: " + products[0].getTypeProduct() + ": " + products[0].getQuantityProduct() + ", " + products[1].getTypeProduct() + ": " +
                products[1].getQuantityProduct() + ", " + products[2].getTypeProduct() + ": " + products[2].getQuantityProduct() +
                ". \nInput names of products you need. Example \"rebar, lamber\"");
        Scanner sc = new Scanner(System.in);
        String productsToPurchase = sc.nextLine();
        Pattern[] patterns = new Pattern[products.length];
        for (int i = 0; i < products.length; i++) {
            patterns[i] = Pattern.compile(products[i].getTypeProduct());
            Matcher matcher = patterns[i].matcher(productsToPurchase.toLowerCase());
            if (matcher.find()) {
                System.out.println("Input quantity of " + products[i].getTypeProduct());
                quantityOfProductInCart = sc.nextDouble();
                while (quantityOfProductInCart > products[i].getQuantityProduct() || quantityOfProductInCart < 0) {
                    System.out.println("Available only " + products[i].getQuantityProduct() + " " + products[i].getTypeProduct() + ". Input another quantity");
                    quantityOfProductInCart = sc.nextDouble();
                }
                if (products[i] instanceof Rebar) {
                    productsInCart.add(new Rebar(quantityOfProductInCart, products[i].getCostProduct()));
                } else if (products[i] instanceof Concrete) {
                    productsInCart.add(new Concrete(quantityOfProductInCart, products[i].getCostProduct()));
                } else if (products[i] instanceof Lamber) {
                    productsInCart.add(new Lamber(quantityOfProductInCart, products[i].getCostProduct()));
                }
            }
        }

        Bargainer seller = new Bargainer("Marta", BigDecimal.valueOf(500000));
        Bargainer buyer = new Bargainer("Dmitry", BigDecimal.valueOf(1000000));
        Deal deal1 = new Deal(seller, buyer, productsInCart);
        deal1.deal();
        sc.close();
    }
}
