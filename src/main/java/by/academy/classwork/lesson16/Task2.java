package by.academy.classwork.lesson16;

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Predicate <String> notNull = str-> {
            if ( str!=null){
                return true;
            }
            else return false;
        };

        System.out.println(notNull.test("123"));
        System.out.println(notNull.test("qwerty"));
        System.out.println(notNull.test(null));

    }
}
