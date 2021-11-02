package by.academy.classwork.lesson4;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i < 20) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
