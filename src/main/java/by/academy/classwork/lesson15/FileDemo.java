package by.academy.classwork.lesson15;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
            File dirs = new File("src/io/1/1");
            if (!dirs.exists()){
                dirs.mkdirs();
            }
            File file = new File(dirs, "TestFile.txt");

        System.out.println(file);
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.delete());

    }
}
