package by.academy.homework.homeworc4;

import by.academy.homework.homework3.DateOfBirthValidator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Date> dates = new ArrayList<>();

    public static void main(String[] args) {
        createDate();
        createDate();
        printDate();
    }

    protected static void createDate() {
        System.out.println("Input date \"dd-mm-yyyy\" or \"dd/mm/yyyy\"");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        while (!isValidDate(data)) {
            data = sc.nextLine();
        }
        Date date = new Date(data);
        dates.add(date);
    }

    protected static void printDate() {
        System.out.println(dates.get(0));
        System.out.println(dates.get(1));
    }

    protected static boolean isValidDate(String data) {
        DateValidator dateValidator = new DateValidator(data);
        return dateValidator.isValid();
    }

}
