package by.academy.classwork.lesson10;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Locale;

public class Demo1 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getDayOfMonth());
        System.out.println(today);
        }
    }


