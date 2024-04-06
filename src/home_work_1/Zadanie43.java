package home_work_1;
import java.util.Scanner;

public class Zadanie43 {

    private double a,b;
    public Zadanie43(){

        this.a = a;
        this.b = b;
       }
    /**.
     * 4.3 Проверка делимости одного числа на другое
      */
    public static double delimost (double a, double b) {
        if (a % b == 0) {
            System.out.println("chisla Delyatsa");
        } else {
            System.out.println("chisla Ne Delyatsa");
        }
        return a % b;
    }

}

