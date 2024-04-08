/*
2.1.1. Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
 */
package home_work_2.Utils_Main;

import home_work_2.Utils.ArraysUtils;

import java.util.Scanner;

public class ArraysUtilsMain {
    public static void main(String[] args) {
        ArraysUtils arraysUtils = new ArraysUtils();
        int[] container1 = arraysUtils.arrayFromConsole();
        int[] container = arraysUtils.arrayRandom(5, 100);
    }


}


