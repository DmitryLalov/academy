package by.academy.classwork.lesson14;

public class Toy {
    private String type;
    private int age;

    public Toy(String type, int age) {
        this.type = type;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
