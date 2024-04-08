/*
1.5.1. Найти наибольшую цифру натурального числа
 */

package home_work_2.loops;
import java.util.Scanner;
public class Zadanie151 {
   private static int max;
    public static int maxChislo (int i) {
        if (i <= 0) {
            System.out.print("Некорректные данные ");
        } else {

            while (i % 10 > max) {
                max = i % 10;
                i = i / 10;
            }
            System.out.println("max " + max);

        }
            return 0;

    }
}
