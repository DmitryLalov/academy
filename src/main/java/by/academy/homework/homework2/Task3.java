package by.academy.homework.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two words");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        if (s1.length() % 2 != 0 || s2.length() % 2 != 0) {
            System.out.println("Invalid words, try input two words again");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s1, 0, s1.length() / 2);
        sb.append(s2, s2.length() / 2, s2.length());
        System.out.println(sb);
        scanner.close();
    }
}
