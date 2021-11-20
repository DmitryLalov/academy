package by.academy.classwork.lesson10;

public class DemoGeneric {
    public static void main(String[] args) {
        GenericBox<Car> item = new GenericBox<>(new Car("BMV", 200));
        System.out.println(item);
    }
}
