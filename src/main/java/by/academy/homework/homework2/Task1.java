package by.academy.homework.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void compareCharsOfStrings(String s1, String s2) {
        if (s1 == null || s2 == null) {
            System.out.println("Strings s1, s2 can't be null");
            return;
        }
        if (s1.length() != s2.length()) {
            System.out.println("Не является");
            return;
        }

        /*Определяем, сколько раз встречается символ строки 1 на i-той позиции в строках 1 и 2
        до тех пор, пока количество совпадений в обеих строках одинаково
        */

        for (int i = 0; i < s1.length(); i++) {
            int countOfCharsS1 = 0;
            int countOfCharsS2 = 0;

            char ch = s1.charAt(i);
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == ch) {
                    countOfCharsS1 += 1;
                }
                if (s2.charAt(j) == ch) {
                    countOfCharsS2 += 1;
                }
            }

            if (countOfCharsS1 != countOfCharsS2) {
                System.out.println("Не является");
                return;
            }
        }
        System.out.println("Является");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two strings");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        compareCharsOfStrings(s1, s2);
        scanner.close();
    }
}
