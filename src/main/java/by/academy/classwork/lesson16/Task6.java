package by.academy.classwork.lesson16;

import by.academy.classwork.lesson13.HeavyBox;

import java.util.function.Consumer;

public class Task6 {
    public static void main(String[] args) {
        HeavyBox heavyBox = new HeavyBox(100, 1,1,1);
        Consumer<HeavyBox> print1 = hb -> System.out.println("Отправили ящик весом " + heavyBox.getWeight());
        Consumer<HeavyBox> print2 = hb -> System.out.println("Отгружаем ящик весом " + heavyBox.getWeight());

        print1.accept(heavyBox);
        print2.andThen(print1);
    }
}
