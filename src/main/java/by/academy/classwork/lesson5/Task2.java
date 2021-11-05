package by.academy.classwork.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of strings");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[n];
        System.out.println("Input " + n + " Strings");
        int[] length = new int[n];
        String[] strings2 = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        strings2[0]=strings[0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {

            }

        }

    }


}
