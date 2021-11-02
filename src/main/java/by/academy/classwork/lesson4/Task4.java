package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое n");
        int n = scanner.nextInt();
        int countSmoller0=0;
        int countMore0=0;
        int countEquals0=0;

        for (int i = 1; i <=n ; i++) {
            double d = scanner.nextDouble();
            if (d<0){
                countSmoller0+=1;
            }
            else if (d>0){
                countMore0+=1;
            }
            else {
                countEquals0+=1;
            }
        }
        System.out.println("CountSmoller0: "+countSmoller0+"\tCountMore0: "+countMore0+"\tCountEquals0: "+countEquals0);
        scanner.close();
    }
}
