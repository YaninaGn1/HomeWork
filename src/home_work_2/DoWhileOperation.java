package home_work_2;

import home_work_2.api.IArraysOperation;

public class DoWhileOperation implements IArraysOperation {

private static int i;

    @Override
    public String writeteAll(int[] array) {
        do {
            System.out.println(i++ + " ");
        }
        while (i < array.length);
        return null;
    }

    @Override
    public String writeTwo(int[] array) {
        do {
            System.out.println(array[i] + " ");
            i = i - 2;
        } while (i < array.length) ;
        return null;
    }

    @Override
    public String writeAllRevers(int[] array) {
        do {
            i --;
        } while (i >= 0) ;
        System.out.println(array[i] + " ");
        return null;
    }
}



