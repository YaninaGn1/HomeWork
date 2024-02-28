
package home_work_2.arrays;

import home_work_2.Utils.ArraysUtils;

public class ArrayIteration {
    public static void main(String[] args) {
/*
Вывести все элементы в консоль.
 */
        int[] arrayFromConsole = (new ArraysUtils()).arrayFromConsole();
        for (int i = 0; i < arrayFromConsole.length; i++) {

            System.out.print(arrayFromConsole[i] + " ");
            System.out.println(" ");
        }

        System.out.println("_____ ");
        for (int i : arrayFromConsole ){

            System.out.print(i + " ");
            System.out.println(" ");
        }

        System.out.println("_____");
        int i = 0;
        while (i < arrayFromConsole.length) {
            System.out.println(arrayFromConsole[i] + " ");
            i++;
        }


        System.out.println("_____");
        do {
            System.out.println(i++ + " ");
                      }
        while (i < arrayFromConsole.length) ;


    }
  /*  2.2.2. Вывести каждый второй элемент массива в консоль.
   */

    public void metod2 (){
        int[] arrayFromConsole = (new ArraysUtils()).arrayFromConsole();
        for (int i = 0; i < arrayFromConsole.length; i = i + 2) {

            System.out.print(arrayFromConsole[i] + " ");
            System.out.println(" ");
        }
        System.out.println("_____ ");
        for (int i : arrayFromConsole ){

            System.out.print((i+2) + " ");
            System.out.println(" ");
        }

        System.out.println("_____");
        int i = 0;
        while (i < arrayFromConsole.length) {
            System.out.println(arrayFromConsole[i] + " ");
            i = i + 2;
        }


        System.out.println("_____");
        do {
            System.out.println(arrayFromConsole[i] + " ");
            i = i - 2;
        } while (i < arrayFromConsole.length) ;
            return ;
    }

    /* 2.2.3. Вывести все элементы массива в консоль в обратном порядке.
         */
    public void metod3 (){
        int[] arrayFromConsole = (new ArraysUtils()).arrayFromConsole();
        for (int i = arrayFromConsole.length; i >= 0; i --) {

            System.out.print(arrayFromConsole[i] + " ");
            System.out.println(" ");
        }

        System.out.println("_____ ");
        for (int i : arrayFromConsole ){

            System.out.print(i + " ");
            System.out.println(" ");
        }

        System.out.println("_____");
        int i = 0;
        while (i >= 0) {
            System.out.println(arrayFromConsole[i] + " ");
            i --;
        }

        System.out.println("_____");
        do {
            System.out.println(arrayFromConsole[i] + " ");
            i --;
        } while (i >= 0) ;
    }
}

