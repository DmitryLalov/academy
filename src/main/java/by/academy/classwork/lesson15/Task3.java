package by.academy.classwork.lesson15;

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        File dir1 = new File("/lesson15/dir1");
        dir1.mkdirs();
        File dir2 = new File("/lesson15/dir2");
        dir2.mkdirs();
        File file1=new File(dir1, "textFile1.txt");
        if (!file1.exists()){
            file1.createNewFile();
        }
        File file2=new File(dir2, "textFile2.txt");
        if (!file2.exists()){
            file2.createNewFile();
        }
        FileWriter fw1 = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fw1);

        bufferedWriter.write("Запись строки в файл 1");
        fw1.close();

        FileReader fr = new FileReader(file2);
        FileWriter fw2 = new FileWriter(file2);
        int j;
        while ((j=fr.read()) != -1) {
            fw2.write((char)j);
        }

        fr.close();
        fw2.close();
        System.out.println(file1);
        System.out.println(file2);

        FileReader fr3 = new FileReader(file2);
        int i;
        while ((i=fr3.read()) !=-1 ){
            System.out.print((char)i);
//            size++;
        }
        fr3.close();
    }
}
