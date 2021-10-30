package by.academy.homework.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input typeData of variable");
        String typeData = scanner.nextLine();

        switch (typeData) {
            case "int" -> {
                System.out.println("Input value of variable (int)");
                System.out.println((scanner.nextInt()) % 2);
            }
            case "double" -> {
                System.out.println("Input value of variable (double)");
                System.out.println((scanner.nextDouble()) * 0.7);
            }
            case "float" -> {
                System.out.println("Input value of variable (float)");
                System.out.println((float) (Math.pow(scanner.nextFloat(), 2)));
            }
            case "char" -> {
                System.out.println("Input value of variable (char)");
                System.out.println(scanner.nextInt());
            }
            case "String" -> {
                System.out.println("Input value of variable (String)");
                System.out.println("Hello " + scanner.nextLine());
            }
            default -> System.out.println("Unsupported type");
        }
        scanner.close();
    }
}
