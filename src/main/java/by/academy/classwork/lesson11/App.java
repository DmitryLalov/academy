package by.academy.classwork.lesson11;

public class App {
    public static void main(String[] args) {
        Double[] array = {1.0,2.0,3.0,0.5,10.0,15.0,2.0,-0.5};
        MinMax<Double> minMax=new MinMax<>(array);
        System.out.println(minMax.getMin());
        System.out.println(minMax.getMax());
    }
}
