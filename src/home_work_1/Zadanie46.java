package home_work_1;

public class Zadanie46 {
   private int d = 2024;
        /**
         * 4.6 Определить високосный год или нет
         */

public static double proverka(int d){
        if (d % 4 == 0) {
            System.out.println("Год высокостный");

        } else {
            System.out.println("Год невысокостный");

        }
        return d;
     }
}