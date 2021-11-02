package by.academy.homework.homework3.Task1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bargainer extends Product {
    String nameBargainer;
    BigDecimal money = new BigDecimal(0.0);
    int difProduct;
    String[] product = new String[difProduct];
    double[] quantityProduct = new double[difProduct];
    BigDecimal[] productCost = new BigDecimal[difProduct];
    int countBargainers = 0;

    public Bargainer(String nameBargainer, BigDecimal money, int difProduct, String[] product,
                     double[] quantityProduct, BigDecimal[] productCost) {
        this.nameBargainer = nameBargainer;
        this.money = money;
        this.difProduct = difProduct;
        this.product = product;
        this.quantityProduct = quantityProduct;
        this.productCost = productCost;
        countBargainers += 1;
    }


    public static void createBargainer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String nameBargainer = scanner.nextLine();
        System.out.println("Input your money");
        BigDecimal money = new BigDecimal(scanner.nextDouble());
        System.out.println("Input your quantity of different products");
        int difProduct = scanner.nextInt();
        String[] product = new String[difProduct];
        double[] quantityProduct = new double[difProduct];
        BigDecimal[] productCost = new BigDecimal[difProduct];

        for (int i = 1; i <= difProduct; i++) {
            System.out.println("Input name product " + i);
            product[i] = scanner.nextLine();
            System.out.println("Input quantity of product " + i);
            quantityProduct[i] = scanner.nextDouble();
            System.out.println("Input cost of product " + i);
            productCost[i] = scanner.nextBigDecimal();
        }
        Bargainer bargainer = new Bargainer(nameBargainer, money, difProduct, product, quantityProduct, productCost);

    }

}
