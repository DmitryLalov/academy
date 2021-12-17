package by.academy.classwork.lesson16;

import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {
        String s="JANA";
        String s2="NAJO";

        Predicate<String> customStr = str -> {
            boolean b=false;
            if (str != null) {
                if ((str.startsWith("J") || str.startsWith("N")) && str.endsWith("A")) {
                     b=true;
                }

            }
            return b;
        };
        if (customStr.test(s)){
            System.out.println(s);
        }
        if (customStr.test(s2)){
            System.out.println(s2);
        }

    }
}

