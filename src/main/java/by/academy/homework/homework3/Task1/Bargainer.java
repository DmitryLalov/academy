package by.academy.homework.homework3.Task1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bargainer {
    String nameBargainer;
    BigDecimal money = new BigDecimal(0.0);

    public Bargainer(String nameBargainer, BigDecimal money) {
        this.nameBargainer = nameBargainer;
        this.money = money;
    }
    public String getNameBargainer(){
        return nameBargainer;
    }
    public BigDecimal getMoney(){
        return money;
    }




//    public static void createBargainer() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input your name");
//        String nameBargainer = scanner.nextLine();
//        System.out.println("Input your money");
//        BigDecimal money = new BigDecimal(scanner.nextDouble());
//        System.out.println("Input your quantity of different products");
//        int difProduct = scanner.nextInt();
//        String[] product = new String[difProduct];
//        double[] quantityProduct = new double[difProduct];
//        BigDecimal[] productCost = new BigDecimal[difProduct];
//
//        Bargainer bargainer = new Bargainer(nameBargainer, money);
//
//    }

}
