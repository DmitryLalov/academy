package by.academy.classwork.lesson1;

import java.math.BigDecimal;

public class Data {
    public static void testdata() {
        BigDecimal money1 = new BigDecimal(200000000);
        int age = 20_000;
//        double money = 200_000_000;
//        System.out.println(money);
        System.out.println("Age: " + age);
        System.out.println("Money1: " + money1);
        char c1 = 100;
        char c2 = 'c';
        System.out.println(c1);
        System.out.println(c2);
        long l = Long.MAX_VALUE;
        int i = (int) l;
        int i1 = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE + 1;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l);
        System.out.println(i);
    }
}
