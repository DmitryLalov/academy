package by.academy.homework.homework3;

public class ValidatorDemo {

    public static void main(String[] args) {
        BelarussianPhoneValidator v = new BelarussianPhoneValidator("+375295198036");
        System.out.println(v.isValid("+375295198036"));
    }
}
