package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое n");
        int n = scanner.nextInt();
        int factorial=1;
        for (int i = 1; i <=n ; i++) {
            factorial=factorial*i;
        }
        System.out.println(factorial);
        scanner.close();
    }
}
