package by.academy.classwork.lesson6;
//Задание 11. (lesson 6)
//
//        Найти слово, в котором число различных символов минимально.
//        Слово может содержать буквы и цифры.
//        Если таких слов несколько, найти первое из них.
//        Например в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".

import java.util.Arrays;

public class Task11 {

    public static void main(String[] args) {
        String s = "fa abc ff 1234 jkjk aaaaaaaa";
        System.out.println(minSymbols(s));
    }

    public static String minSymbols(String s) {
        String[] strings = s.split("\\s+");

        int minSymbols = strings[0].length();
        int counter = 1;
        String s2 = strings[0];
        for (String str : strings) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            for (int i = 0; i < chars.length - 1; i++) {
                if (chars[i + 1] != chars[i]) {
                    counter++;
                }
            }
            s2 = counter < minSymbols ? str : s2;
            minSymbols = Math.min(counter, minSymbols);
            counter = 1;
        }
        return s2;
    }
}
