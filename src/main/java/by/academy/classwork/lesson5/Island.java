package by.academy.classwork.lesson5;

import java.util.Arrays;

public class Island {
    public static void main(String[] args) {
        int[]height = new int[10];
        for (int i = 0; i < height.length; i++) {
            height[i]=(int)(Math.random()*10+1);
        }
        for (int i = 0; i < height.length; i++) {
            System.out.print(height[i]+"\t");
        }

    }
    public int area(int[] height) {

        int area = 0;
        int maxHeight;
        int maxHeightLeft;
        int maxHeightRight;
        int posHeight;
        int posHeightLeft;
        int posHeightRight;


        for (int i = 0; i < height.length; i++) {
            if (height.length < 2) {
                break;
            }
        }
        return 5;
    }
}
