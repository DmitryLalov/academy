package by.academy.classwork.lesson2;

import java.math.BigDecimal;

public class Applications {
    public static void main(String[] args) {

        Cat cat1=new Cat("Max", 4, BigDecimal.valueOf(500));

        System.out.println(cat1);                           //Проверка работы конструктора с параметрами

        /*
        Проверка работы методов Set, Get
         */
        cat1.setAge(5);
        cat1.setMoney(BigDecimal.valueOf(1000));
        cat1.setName("Maxim");

        System.out.println("Name: "+cat1.getName());
        System.out.println("Age: "+cat1.getAge());
        System.out.println("Money: "+cat1.getMoney());

        Cat cat2=new Cat();                                 //Проверка работы конструктора без параметров
        cat2.setName("Kivi");
        cat2.setAge(5);
        cat2.setMoney(BigDecimal.valueOf(2000));
        System.out.println(cat2);

        cat1.setSleap(false);
        cat1.setEat(true);
        cat1.setWalk(false);
        cat1.getSleep();
        cat1.getEat();
        cat1.getWalk();

        System.out.println("Commit_2");

    }
}
