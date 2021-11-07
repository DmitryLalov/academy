package by.academy.classwork.lesson6;

import java.util.Scanner;

public class Task1 {
    private static void stringMethods(String s){
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.replace('a', 'o'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("Java")+"Java".length()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String");
        String s = sc.nextLine();

        stringMethods(s);
        sc.close();
    }
}
