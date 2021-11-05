package by.academy.classwork.lesson5;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String s1 = "Str";
        String s2 = "Stri";
        String s3 = "Stra";
        String s4 = "Str ";
        String s5 = "Str 0";
        String[] array ={s1, s2, s3, s4, s5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
