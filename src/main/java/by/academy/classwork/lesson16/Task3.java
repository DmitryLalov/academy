package by.academy.classwork.lesson16;

import java.util.function.Predicate;

public class Task3 {

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

            System.out.println(notEmpty.test("123"));
            System.out.println(notEmpty.test("qwerty"));
            System.out.println(notEmpty.test(null));

        }

}
