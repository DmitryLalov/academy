package by.academy.classwork.lesson15;

import java.io.*;

public class DemoSerializable {
    public static void main(String[] args) throws FileNotFoundException {
        User user = new User("SuperAdmin", "qwerty");
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src/io/user.txt"));
            ObjectOutputStream osu = new ObjectOutputStream(bufferedOutputStream)) {
            osu.write(1);
            osu.writeBytes("String");
               osu.writeObject(user);
            }

        catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        System.out.println(user);

}
}
