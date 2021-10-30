package by.academy.homework.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value from 1 to 10");
        int a = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(a+" x "+i+"\t="+a*i);
        }
    }
}
