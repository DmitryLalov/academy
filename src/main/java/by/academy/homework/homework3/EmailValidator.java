package by.academy.homework.homework3;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    private String email;

    public EmailValidator(String email) {
        this.email = email;
    }

    private static final Pattern p = Pattern.compile("\\w+\\@\\w+.\\w{2,5}");

    @Override
    public Pattern getPattern() {
        return p;
    }
}
