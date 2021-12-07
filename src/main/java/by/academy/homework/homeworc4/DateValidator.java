package by.academy.homework.homeworc4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {
    private String data;
    private static final Pattern p = Pattern.compile("(^((0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-(19|20)\\d\\d)$)|" +
            "(^((0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/(19|20)\\d\\d)$)");

    public DateValidator(String data) {
        this.data = data;
    }


public boolean isValid(){
    Matcher matcher = p.matcher(data);
    return matcher.find();
}
}
