package home_work_2;

import home_work_2.api.IArraysOperation;

public class ForOperation implements IArraysOperation {
    private int i;

    @Override
    public String writeteAll(int[] array) {
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            System.out.println(" ");
        }
        System.out.println("_____ ");
        return null;
    }

    @Override
    public String writeTwo(int[] array) {
        for (int i = 0; i < array.length; i = i + 1) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");

            }

        }
        return null;
    }

        @Override
        public String writeAllRevers ( int[] array){
            for (i = array.length - 1; i >= 0; i--) {

                System.out.print(array[i] + " ");
            }

            return null;
        }
    }




