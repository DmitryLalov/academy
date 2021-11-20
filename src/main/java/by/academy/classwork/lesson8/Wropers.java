package by.academy.classwork.lesson8;

public class Wropers {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();


        int k = 0;
//        Integer i1 = new Integer(3);
//        System.out.println(i1);
//        Integer i2 = -1000000000;
//        System.out.println(i2);
//        int b = Integer.MAX_VALUE;
//        System.out.println(b);
//        int x=-9;
//        System.out.println(Math.sqrt(x));
//        for (int i = 0; i < 1000000000; i++) {
//            k += i;
//        }
//        System.out.println(k);

        for (Integer i1 = 0; i1 < 1000000000; i1++) {
            k += i1;
        }
        System.out.println(k);

        long end = System.currentTimeMillis();
        long time=end-start;
        System.out.println(time);
    }
}
