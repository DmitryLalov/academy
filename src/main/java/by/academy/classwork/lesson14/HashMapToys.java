package by.academy.classwork.lesson14;

import java.util.HashMap;

public class HashMapToys {

    public static void main(String[] args) {
        Toy toy1 = new Toy("Кукла", 2);
        Toy toy2 = new Toy("Машинка", 3);
        Toy toy3 = new Toy("Конструктор", 6);

        HashMap<String, Toy> mapToys = new HashMap<>();
        mapToys.put("Для детей от 2 лет", toy1);
        mapToys.put("Для детей от 3 лет", toy2);
        mapToys.put("Для детей от 6 лет", toy3);

        printEntry(mapToys);
        printKeys(mapToys);
        printValues(mapToys);

    }
    public static void printEntry(HashMap<String, Toy> mapToys){
        for (String key : mapToys.keySet()) {
            System.out.println(key + ": "+ mapToys.get(key));
        }
    }
    public static void printKeys(HashMap<String, Toy> mapToys){
        for (String key : mapToys.keySet()) {
            System.out.println(key);
        }
    }
    public static void printValues(HashMap<String, Toy> mapToys){
        for (String key : mapToys.keySet()) {
            System.out.println(mapToys.get(key));
        }
    }
}
