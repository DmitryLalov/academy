package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 3");
        //Test Scanner sc

        Scanner sc =new Scanner(System.in);

        System.out.println("Введите число int a");
        int a = sc.nextInt();
        System.out.println("Введите double d");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.println("Введите String name");
        String name = sc.nextLine();

        System.out.println("a= "+a+"\td= "+d+"\tname: "+name);
        sc.close();

        int i =4;
        i-=1;
        System.out.println(i);
        d=d/5;
        System.out.println(d);

    }
}
