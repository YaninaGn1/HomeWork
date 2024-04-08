package home_work_2;

import home_work_2.api.IArraysOperation;

public class WhileOperation  implements IArraysOperation {
private int i;
    @Override
    public String writeteAll(int[] array) {
        while (i < array.length) {
            System.out.println(array[i] + " ");
            i++;
        }
        System.out.println("_____");
        return null;
    }

    @Override
    public String writeTwo(int[] array) {
        i = 0;
        while (i < array.length) {
            if (i % 2 != 0) {
                System.out.println(array[i] + " ");
            }
            i = i + 1;
        }
        return null;
    }

    @Override
    public String writeAllRevers(int[] array) {
         i = array.length - 1;
        while (i >= 0) {

            System.out.println(array[i] + " ");
            i = i -1;
        }
        return null;
    }
}
