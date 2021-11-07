package by.academy.classwork.lesson6;
//Изменить регулярное выражение в примере для нахождения строк cab, ccab, cccab.
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegexDemo2 {
//    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("a*b");
//        Matcher matcher = pattern.matcher("aaab");
//        boolean b = matcher.matches();
//        System.out.println(b);
//    }
//}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[c]{1,3}ab");
        Matcher matcher = pattern.matcher("cccab");
        boolean b = matcher.matches();
        System.out.println(b);
    }
    }

