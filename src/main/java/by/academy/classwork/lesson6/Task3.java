package by.academy.classwork.lesson6;

public class Task3 {
    public static void main(String[] args) {
        String s="Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        String sKey="object-oriented programming";
        for (int i = 0; i < s.length(); i++) {
            int index = s.indexOf(sKey);
        }
    }
}
