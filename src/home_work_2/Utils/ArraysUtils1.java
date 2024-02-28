package home_work_2.Utils;

import java.util.Random;

public class ArraysUtils1 {
    public static void main(String[] args) {
       int[] container = arrayRandom (5,100);
    }
    public static int[] arrayRandom (int size, int maxValueExclusion) {
        int array[] = new int[5];
        Random container = new Random(maxValueExclusion);
        for (int i = 0; i < size; i++) {
            array[i] = container.nextInt(maxValueExclusion);
            System.out.println(array[i]);
        }
        return array;
    }
}
