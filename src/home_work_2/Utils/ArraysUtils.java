/*
2.1.1. Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
 */
package home_work_2.Utils;

import java.util.Scanner;
public class ArraysUtils {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        }
    public static int[] arrayFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.print("Напишите размер массива ");
        int length = in.nextInt();
        int array[] = new int[length];

        System.out.print("Напишите элементы массива ");
        for (int i = 0; i < length; i++) {
            array[i] = in.nextInt();

            System.out.print("Элементы массива ");
        }
        for (int i = 0; i < length; i++) {
                System.out.print(" " + array[i]);
            }
            System.out.println(" ");
            return array;
    }

}


