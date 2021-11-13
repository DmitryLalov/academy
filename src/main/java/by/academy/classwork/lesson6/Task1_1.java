package by.academy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1_1 {

    public static void main(String[] args) {
        String s1 = "London. is, the - capital! England?";
        String s2 = "London.,? is, -the - capital!? England?";

        Pattern pattern=Pattern.compile ("[.,\\-!?]+");
        Matcher matcher = pattern.matcher(s2);
        int count=0;
        while (matcher.find()){
            System.out.println(s2.substring(matcher.start(), matcher.end()));
            count++;
        }
        System.out.println(count);
    }
}
