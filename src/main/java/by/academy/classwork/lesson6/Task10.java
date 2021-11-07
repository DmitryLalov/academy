package by.academy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    private static final String str="comandorld@gmail.com, adam_ok@mail.ru, met_met@yandex.ru";
    private static final Pattern pattern = Pattern.compile("[a-zA-Z_0-9]+\\@[a-zA-Z]+\\.[a-z]{0,5}");

    public static void main(String[] args) {

        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
