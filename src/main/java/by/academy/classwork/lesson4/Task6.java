package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада S");
        double s = scanner.nextDouble();
        System.out.println("Введите период вклада N лет");
        int n = scanner.nextInt();
        double s1 = s;

        for (int i = 1; i <= n; i++) {
            s1 = s1 + s1 * 0.03;
        }
        System.out.println("Изначальная сумма: " + s + "\tПериод: " + n + "\tКонечная сумма: " + s1);
        scanner.close();
    }
}
