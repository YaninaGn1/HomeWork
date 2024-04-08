/*
1.5.4. Ряд Фибоначчи
 */
package home_work_2.loops;
import java.util.Scanner;
public class Zadanie154 {
   private static int n1 = 1;
    private static   int n2 = 1;
    private static  int n3;
    public static String fib(int n) {

       for (int i = 3; i <= n; i++) {
           n3 = n2 + n1;
           System.out.print(" " + n3);
           n1 = n2;
           n2 = n3;
            }
                System.out.println();
       return ("" );
    }
}

