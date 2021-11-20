package by.academy.homework.homework3;

import java.util.regex.Pattern;

public class BelarussianPhoneValidator implements Validator{
    private String phoneNumber;

    public BelarussianPhoneValidator(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private static final Pattern p=Pattern.compile("\\+375\\d{9}");
    @Override
    public Pattern getPattern() {
        return p;
    }
}
