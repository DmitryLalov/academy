package by.academy.homework.homework1;

public class Task4 {
    public static void main(String[] args) {
        int i=0;
        while ((int)(Math.pow(2,i))<1_000_000){
            System.out.println("2 pov "+i+" = "+(int)(Math.pow(2,i)));
            i++;
        }
    }
}
