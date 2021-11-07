package by.academy.classwork.lesson6;

public class Task2 {
    public static void main(String[] args) {
        int x1 = 3;
        int x2 = 56;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        sb1.append(x1).append(" + ").append(x2).append(" = ").append(x1 + x2);
        System.out.println(sb1);

        sb2.append(x1).append(" - ").append(x2).append(" = ").append(x1 - x2);
        System.out.println(sb2);

        sb3.append(x1).append(" * ").append(x2).append(" = ").append(x1 * x2);
        System.out.println(sb3);

        sb1.insert(sb1.indexOf("=") + 1, "равно");
        sb1.deleteCharAt(sb1.indexOf("="));
        System.out.println(sb1);
        sb2.insert(sb2.indexOf("=") + 1, "равно");
        sb2.deleteCharAt(sb2.indexOf("="));
        System.out.println(sb2);
        sb3.insert(sb3.indexOf("=") + 1, "равно");
        sb3.deleteCharAt(sb3.indexOf("="));
        System.out.println(sb3);

        sb1.replace(sb1.indexOf("равно"), sb1.indexOf("равно") + "равно".length(), "=");
        System.out.println(sb1);
        sb2.replace(sb2.indexOf("равно"), sb2.indexOf("равно") + "равно".length(), "=");
        System.out.println(sb2);
        sb3.replace(sb3.indexOf("равно"), sb3.indexOf("равно") + "равно".length(), "=");
        System.out.println(sb3);

    }
}
