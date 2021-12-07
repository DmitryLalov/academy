package by.academy.classwork.lesson11;

import java.util.Arrays;

public class MinMax <T extends Number & Comparable> {
    private T[] array;



    public MinMax(T[] array) {
        this.array = array;
    }

    protected Double getMin(){
        Double min = array[0].doubleValue();
        for (T value:array) {
            if (value.doubleValue()<min){
                min= value.doubleValue();
            }
        }
        return min;
    }
    protected Double getMax(){
        Double max = array[0].doubleValue();
        for (T value:array) {
            if (value.doubleValue()>max){
                max= value.doubleValue();
            }
        }
        return max;
    }



}
