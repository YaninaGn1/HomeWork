package home_work_2;

import home_work_2.api.IArraysOperation;

public class DoWhileOperation implements IArraysOperation {

private  int i;

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
        i = 0;
        do {
            if (i % 2 != 0) {
                System.out.println(array[i] + " ");
            }
            i = i +1;
        } while (i < array.length) ;
        return null;
    }

    @Override
    public String writeAllRevers(int[] array) {
       i = array.length-1;
        do {
            System.out.println(array[i] + " ");
            i = i-1;
        } while (i >= 0);

        return null;
    }
}



