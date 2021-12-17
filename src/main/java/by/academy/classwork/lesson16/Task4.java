package by.academy.classwork.lesson16;

import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {
        Predicate <String> notEmpty = str-> {
            if (str!=null){
                if ( !str.isEmpty()){
                    return true;
                }
                else return false;
            }
            System.out.println(" String is Null");
            return false;
        }  ;
        Predicate <String> notNull = str-> {
            if ( str!=null){
                return true;
            }
            else return false;
        };

        System.out.println(notNull.and(notEmpty).test("123"));
        System.out.println(notNull.and(notEmpty).test(null));

    }
}
