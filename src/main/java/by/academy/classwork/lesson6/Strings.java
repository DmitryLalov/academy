package by.academy.classwork.lesson6;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i =1;
        while (i!=-1){
            System.out.println("Input string");
            String s = scanner.nextLine();
            if (s.isEmpty()){
                System.out.println("String is empty");
                continue;
            }
            if(s.length()%2==0){
                int startIndex=s.length()/2-1;
                StringBuilder sb=new StringBuilder();
                sb.append(s, startIndex, startIndex+2);
                System.out.println(sb);
                System.out.println("Input -1 to stop");
                i= scanner.nextInt();
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
