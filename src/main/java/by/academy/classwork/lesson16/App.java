package by.academy.classwork.lesson16;

public class App {
    public static class Bird {
        private String name;

        public Bird (String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }
    @FunctionalInterface
    interface Flyable {
        void fly (Bird bird);
    }

    public static void main(String[] args) {
        Bird bird = new Bird ("Орел");

        Flyable flyable = b -> System.out.println(" Птица летает " + b.getName());

        flyable.fly(bird);
    }
}
