package by.academy.classwork.lesson14;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Vasya", 7);
        map.put("Nastya", 8);
        map.put("Andrew", 6);

        System.out.println(map.get("Vasya"));
        map.entrySet();

//        for (Map.Entry<String, Integer> entry : map) {
//
//        }

    }
}
