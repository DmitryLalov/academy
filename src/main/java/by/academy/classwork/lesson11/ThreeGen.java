package by.academy.classwork.lesson11;

import by.academy.homework.homework3.Lamber;
import by.academy.homework.homework3.Product;

import java.io.Serializable;

public class ThreeGen <T extends CharSequence & Comparable<T>, V extends Product & Serializable, K extends Integer> {
    private T objT;
    private V objV;
    private K objK;

    public ThreeGen (){
        super();
    }

    public ThreeGen(T objT, V objV, K objK) {
        this.objT = objT;
        this.objV = objV;
        this.objK = objK;
    }

    public T getObjT() {

        return objT;
    }

    public V getObjV() {
        return objV;
    }

    public K getObjK() {
        return objK;
    }
    public void printObjectClasses (){
        System.out.println(objT.getClass().getName());
        System.out.println(objV.getClass().getName());
        System.out.println(objK.getClass().getName());
    }

//    public static void main(String[] args) {
//        ThreeGen<String, Product, Integer> object = new ThreeGen<>("Hello World", new Lamber(), 123);
//        object.printObjectClasses();
//    }

}
