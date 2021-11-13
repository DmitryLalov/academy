package by.academy.homework.homework3.Task1;

import java.math.BigDecimal;

public class App {
    public static void main (String[]args){
int numberOfProduct=3;
Product[] products = new Product[numberOfProduct];
products[0]=new Reinforcement( 15, BigDecimal.valueOf(2000), 0.5);
products[1]=new Concrete(6, BigDecimal.valueOf(100));
products[2]=new Lamber(100, BigDecimal.valueOf(800));
Bargainer seller = new Bargainer("Dima", BigDecimal.valueOf(50000));
Bargainer buyer = new Bargainer("Marta", BigDecimal.valueOf(50000));
Deal deal1 = new Deal(seller, buyer, products);
deal1.deal();

    }
}
