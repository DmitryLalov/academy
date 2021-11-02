package by.academy.homework.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void minDifSymbols(String[] strings) {

        int position = 0; //Позиция строки в массиве строк с минимальным количеством различных символов
        int minDifSymbols = 0; //Минимальное количество различных символов
        int countDifSymbols = 0;  //Счетчик количества различных символов

        /*
        Принимаем значение minDifSymbols равным количеству различных символов в строке 1.
         */

        if (strings[0] == null) {
            System.out.println("String can't be null");
            return;
        }
        if (strings[0].isEmpty()) {
            System.out.println("\"\"");
            return;
        }
        if (strings[0].length() == 1) {
            countDifSymbols = 1;
        } else {
            countDifSymbols = 1;
            char[] chars = strings[0].toCharArray();
            Arrays.sort(chars);
            for (int j = 1; j < chars.length; j++) {
                if (chars[j] != chars[j - 1]) {
                    countDifSymbols += 1;
                }
            }
        }
        minDifSymbols = countDifSymbols;

        /*
        Поиск строки с минимальным количеством различных символов.
         */

        for (int i = 1; i < strings.length; i++) {
            if (strings[i] == null) {
                System.out.println("String can't be null");
                return;
            }
            if (strings[i].isEmpty()) {
                System.out.println("");
                return;
            }
            if (strings[i].length() == 1) {
                countDifSymbols = 1;
            } else {
                countDifSymbols = 1;
                char[] chars = strings[i].toCharArray();
                Arrays.sort(chars);
                for (int j = 1; j < chars.length; j++) {
                    if (chars[j] != chars[j - 1]) {
                        countDifSymbols += 1;
                    }
                }
            }
            if (countDifSymbols < minDifSymbols) {
                position = i;
            }
        }
        System.out.println(strings[position]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n - quantity words");
        int n = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[n];

        System.out.println("Input " + n + " words");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        minDifSymbols(strings);
        scanner.close();
    }
}
