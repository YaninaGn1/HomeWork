
package home_work_2.arrays;

import home_work_2.Utils.ArraysUtils;

public class ArrayIteration {
    private  static int[] arrayFromConsole = (new ArraysUtils()).arrayFromConsole();
    private static int i =0;
    private static  String k = "";

    public static void main(String[] args) {
        /*
    Вывести все элементы в консоль.
    */
         metod1();
        System.out.print(arrayFromConsole[i] + " ");

        /*  2.2.2. Вывести каждый второй элемент массива в консоль.
         */
        metod2();
        System.out.print((i+2) + " ");

        /* 2.2.3. Вывести все элементы массива в консоль в обратном порядке.
         */

          metod3 ();
        System.out.print(i + " ");
    }
    /*
Вывести все элементы в консоль.
 */
    public static int metod1() {
        for (i = 0; i < arrayFromConsole.length; i++) {
            System.out.print(arrayFromConsole[i] + " ");
            System.out.println(" ");
        }
        System.out.println("_____ ");

        for (int i : arrayFromConsole) {

            System.out.print(i + " ");
            System.out.println(" ");
        }

        System.out.println("_____");




            while (i < arrayFromConsole.length) {
                System.out.println(arrayFromConsole[i] + " ");
                i++;
            }
            System.out.println("_____");



        do {
            System.out.println(i++ + " ");
        }
        while (i < arrayFromConsole.length);
    return 0;
    }

  /*  2.2.2. Вывести каждый второй элемент массива в консоль.
   */

    public static void metod2 () {
        for (int i = 0; i < arrayFromConsole.length; i = i + 1) {
            if (i % 2 != 0) {
                System.out.print(arrayFromConsole[i] + " ");

            }

        }

        int k = 0;
        for (int i : arrayFromConsole) {
            if (k % 2 != 0) {
                System.out.println(i + " ");
            }
            k = k + 1;
            System.out.println("_____");


            i = 0;
            while (i < arrayFromConsole.length) {
                if (i % 2 != 0) {
                    System.out.println(arrayFromConsole[i] + " ");
                }
                i = i + 1;
            }


            System.out.println("_____");
            i = 0;
            do {
                if (i % 2 != 0) {
                    System.out.println(arrayFromConsole[i] + " ");
                }
                i = i + 1;
            } while (i < arrayFromConsole.length);

        }
    }

    /* 2.2.3. Вывести все элементы массива в консоль в обратном порядке.
         */
    public static void metod3(){
        for (i = arrayFromConsole.length - 1; i >= 0; i--) {

            System.out.print(arrayFromConsole[i] + " ");
        }
        System.out.println("_____");

            for (int i : arrayFromConsole ){
                k = i + " " + k;
            }
            System.out.print(k);

        System.out.println("_____");

        i = arrayFromConsole.length - 1;
        while (i >= 0) {

            System.out.println(arrayFromConsole[i] + " ");
            i = i -1;
        }

        i = arrayFromConsole.length-1;
        do {
            System.out.println(arrayFromConsole[i] + " ");
            i = i -1;
        } while (i >= 0) ;

    }
}


