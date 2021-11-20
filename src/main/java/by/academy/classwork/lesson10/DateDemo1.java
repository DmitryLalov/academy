package by.academy.classwork.lesson10;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
//        LocalDate birthDay = LocalDate.of(1992, 3, 21);
//        print (birthDay);
//        LocalDate today = LocalDate.now();
//        compareDate(birthDay, today);
        LocalDate[] holidays = new LocalDate[2];
            holidays[0]=LocalDate.of(2022, 1, 1);
            holidays[1]=LocalDate.of(2022, 1, 7);
//        printGraphicHoliday(holidays);
    }
    public static void print(LocalDate birthDay){
        System.out.println(birthDay.getDayOfWeek());
        System.out.println(birthDay.getDayOfYear());
        System.out.println(birthDay.getMonth());
        System.out.println(birthDay.getYear());
    }
    public static void compareDate(LocalDate birthDay, LocalDate today){
        if (today.isAfter(birthDay)){
            System.out.println("today is after birthDay");
        }
        if (today.isBefore(birthDay)){
            System.out.println("today is before birthDay");
        }
    }
//    public static void printGraphicHoliday(LocalDate[] holidays){
//        DateFormat dateFormat = new DateFormat() {
//            @Override
//            public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
//                return null;
//            }
//            @Override
//            public Date parse(String source, ParsePosition pos) {
//                return null;
//            }
//        };
//
//        for (LocalDate holiday:holidays) {
//            System.out.println(holiday.format(format));
//        }
//    }
}
