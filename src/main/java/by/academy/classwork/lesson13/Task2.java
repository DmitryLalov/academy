package by.academy.classwork.lesson13;

import java.util.Iterator;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        HeavyBox hb1=new HeavyBox(1,1,1,5);
        HeavyBox hb2=new HeavyBox(2,2,2,4);
        HeavyBox hb3=new HeavyBox(3,3,3,3);
        HeavyBox hb4=new HeavyBox(4,4,4,2);
        HeavyBox hb5=new HeavyBox(5,5,5,1);

        TreeSet<HeavyBox> treeSet = new TreeSet<>();
        treeSet.add(hb1);
        treeSet.add(hb2);
        treeSet.add(hb3);
        treeSet.add(hb4);
        treeSet.add(hb5);

//        for (HeavyBox hb:treeSet) {
//            System.out.println(hb);
//        }
        Iterator<HeavyBox> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            HeavyBox hb= iterator.next();
            System.out.println(hb);
        }

    }

}
