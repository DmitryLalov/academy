package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of strings");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[n];
        System.out.println("Input "+n+" Strings");
        for (int i = 0; i < n; i++) {
            strings[i]= scanner.nextLine();
        }
        int maxChars=0;
        int minChars=strings[0].length();
        int indexMaxChars=0;
        int indexMinChars=0;

        for (int i = 0; i < n; i++) {
            if (strings[i].length()>maxChars){
                maxChars=strings[i].length();
                indexMaxChars=i;
            }
            if (strings[i].length()<minChars){
                minChars=strings[i].length();
                indexMinChars=i;
            }

        }
        System.out.println(strings[indexMinChars]+" "+minChars+", "+strings[indexMaxChars]+" "+ maxChars);
scanner.close();
    }
}
