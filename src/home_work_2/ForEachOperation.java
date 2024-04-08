package home_work_2;

import home_work_2.api.IArraysOperation;

public class ForEachOperation implements IArraysOperation {
    @Override
    public String writeteAll(int[] array) {
        for (int i : array) {

            System.out.print(i + " ");
            System.out.println(" ");
        }
        return null;
    }

    @Override
    public String writeTwo(int[] array) {
        int k = 0;
        for (int i : array ){
            if (k % 2 != 0) {
                System.out.println(i + " ");
            }
            k = k+1;
        }

        return null;
    }

    @Override
    public String writeAllRevers(int[] array) {
    String k = "";
        for (int i : array ){
            k = i + " " + k;
        }
        System.out.print(k);

        return null;
    }
}
