package by.academy.classwork.lesson13;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        HeavyBox hb1=new HeavyBox(1,1,1,1);
        HeavyBox hb2=new HeavyBox(2,2,2,2);
        HeavyBox hb3=new HeavyBox(3,3,3,3);
        HeavyBox hb4=new HeavyBox(4,4,4,4);
        HeavyBox hb5=new HeavyBox(5,5,5,5);

        ArrayList<HeavyBox> arrayList = new ArrayList<HeavyBox>(6);

        arrayList.add(hb1);
        arrayList.add(hb2);
        arrayList.add(hb3);
        arrayList.add(hb4);
        arrayList.add(hb5);

        for (HeavyBox hb:arrayList) {
            System.out.println(hb);
        }

        hb1.weight+=1;
        arrayList.get(0).weight+=1;
        arrayList.set(0, hb1);
        arrayList.set(0, hb1);
        arrayList.remove(arrayList.lastIndexOf(arrayList));

        HeavyBox[] heavyBoxes=new HeavyBox[arrayList.size()];
        arrayList.toArray(heavyBoxes);

//        HeavyBox[] heavyBoxes1 = arrayList.toArray();

        arrayList.removeAll(arrayList);
    }
}
