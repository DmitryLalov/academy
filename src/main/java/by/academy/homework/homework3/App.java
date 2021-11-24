package by.academy.homework.homework3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    private static Product[] productsAfterDeal;
    public static void main(String[] args) {
        createDeal(createProduct());               //Создание сделки. Внутри сначала создается массив продуктов,
                                                   // которым владеет пользователь Bargainer seller
    }
    /*
    Метод createDeal создает сделку и проводит ее, если это возможно (у покупателя достаточно денег,
    у продавца достаточно продукта. В случае совершения сделки у пользователей изменяется только количество денег в
    соответствии с суммой сделки. Количество имеющихся у них продуктов пока (!!!) не изменяется.
     */
    protected static void createDeal(Product[] products) {
        Scanner scanner = new Scanner(System.in);
        Bargainer seller = new Bargainer("Marta", BigDecimal.valueOf(500000));
        Bargainer buyer = new Bargainer("Dmitry", BigDecimal.valueOf(1000000));
        System.out.println("Input your date of birth, "+buyer.getNameBargainer());

        Deal deal1 = new Deal(seller, buyer, productsInCart(products), products, productsAfterDeal);
        deal1.deal();
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
Метод productsInCart позволяет выбрать продукты из имеющихся, указать их количество и добавить в корзину.
 */

    protected static ArrayList<Product> productsInCart(Product[] products) {
        ArrayList<Product> productsInCart = new ArrayList<>(products.length);
        double quantityProductInCart = 0;
        productsAfterDeal=products.clone();
        printProduct(products);
        System.out.println("Input names of products you need. Example \"rebar, lamber\"");

//        System.out.println("Available products: " + products[0].getTypeProduct() + ": " +
//                products[0].getQuantityProduct() + ", " + products[1].getTypeProduct() + ": " +
//                products[1].getQuantityProduct() + ", " + products[2].getTypeProduct() + ": " +
//                products[2].getQuantityProduct() +
//                ". \nInput names of products you need. Example \"rebar, lamber\"");

        Scanner sc = new Scanner(System.in);
        String productsToPurchase = sc.nextLine();
        Pattern[] patterns = new Pattern[products.length];
        for (int i = 0; i < products.length; i++) {
            patterns[i] = Pattern.compile(products[i].getTypeProduct());
            Matcher matcher = patterns[i].matcher(productsToPurchase.toLowerCase());
            if (matcher.find()) {
                System.out.println("Input quantity of " + products[i].getTypeProduct());
                quantityProductInCart = sc.nextDouble();
                while (quantityProductInCart > products[i].getQuantityProduct() || quantityProductInCart < 0) {
                    System.out.println("Available only " + products[i].getQuantityProduct() + " " +
                            products[i].getTypeProduct() + ". Input another quantity");
                    quantityProductInCart = sc.nextDouble();
                }
                productsAfterDeal[i].setDecreaseQuantityProduct(quantityProductInCart);

                if (products[i] instanceof Rebar) {
                    productsInCart.add(new Rebar(quantityProductInCart, products[i].getCostProduct()));
                } else if (products[i] instanceof Concrete) {
                    productsInCart.add(new Concrete(quantityProductInCart, products[i].getCostProduct()));
                } else if (products[i] instanceof Lamber) {
                    productsInCart.add(new Lamber(quantityProductInCart, products[i].getCostProduct()));
                }
            }
        }
//        sc.close();
        return productsInCart;
    }
    protected static void printProduct(Product[] products){
        System.out.println("Available products: ");
        for (Product p:products) {
            System.out.print(p.getTypeProduct() + ": " +
                    p.getQuantityProduct() + ";\t");
        }
    }
}
