package by.academy.homework.homework1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        BigDecimal discount = new BigDecimal(.0d);
        BigDecimal finalPurchaseValue = new BigDecimal(.0d);
        BigDecimal purchaseValue100 = new BigDecimal(100d);
        BigDecimal purchaseValue200 = new BigDecimal(200d);
        BigDecimal purchaseValue300 = new BigDecimal(300d);
        BigDecimal purchaseValue400 = new BigDecimal(400d);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please, Input purchase value and age of the buyer");
        BigDecimal purchaseValue = new BigDecimal(scanner.nextDouble());
        int age = scanner.nextInt();

        if (purchaseValue.compareTo(BigDecimal.valueOf(0d))>=0 & age>=0){

            if (purchaseValue.compareTo(purchaseValue100)<0){
                discount = (BigDecimal.valueOf(0.05));
            }
            else if (purchaseValue.compareTo(purchaseValue100)>=0 & purchaseValue.compareTo(purchaseValue200)<0){
                discount = (BigDecimal.valueOf(0.07));
            }
            else if (purchaseValue.compareTo(purchaseValue200)>=0 & purchaseValue.compareTo(purchaseValue300)<0){
                discount=(age>18)?(BigDecimal.valueOf(0.12+0.04)):(BigDecimal.valueOf(0.12-0.03));
            }
            else if (purchaseValue.compareTo(purchaseValue300)>=0 & purchaseValue.compareTo(purchaseValue400)<0){
                discount = (BigDecimal.valueOf(0.15));
            }
            else if (purchaseValue.compareTo(purchaseValue400)>=0){
                discount = BigDecimal.valueOf(0.2);
            }
            System.out.println("Final purchase value: "+
                    (purchaseValue.add(purchaseValue.multiply(discount.multiply(BigDecimal.valueOf(-1d))))));
        }
        else {
            System.out.println("Incorrect purchase value or age. Try again Input purchase value and age of the buyer");
        }
        scanner.close();
    }

}
