package by.academy.classwork.lesson12;

public class App {
    public static void main(String[] args) {
        Street street = new Street("Nezavisimosti");
        Street.Home home = street.new Home("150");
        System.out.println(home.toString());
    }
}
