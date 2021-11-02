package by.academy.homework.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    static int pairs(int[] arr, int k) {
        int pairsCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[j] - arr[i]) == k) {
                    pairsCount += 1;
                }
            }
        }
        return pairsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите количество чисел в массиве n от 2 до 100_000 и " +
                "целевое значение k от 0 до 1_000_000_000 через пробел");
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        if (n >= 2 & n <= 100_000) {
            int k = Integer.parseInt(nk[1]);
            if (k > 0 & k < 1_000_000_000) {
                int[] arr = new int[n];
                System.out.println("Input " + n + " int values from \" \"");
                String[] arrItems = scanner.nextLine().split(" ");
                System.out.println(Arrays.toString(arrItems));

                for (int i = 0; i < n; i++) {
                    int a = Integer.parseInt(arrItems[i]);
                    if (a > 0 & Arrays.binarySearch(arr, a) < 0) {
                        arr[i] = a;
                    } else {
                        System.out.println("Invalid value arr[i]");
                        System.exit(1);
                    }
                }
                int result = pairs(arr, k);
                System.out.println(result);
            } else {
                System.out.println("Invalid value k");
            }
        } else {
            System.out.println("Invalid value n");
        }
        scanner.close();
    }
}
