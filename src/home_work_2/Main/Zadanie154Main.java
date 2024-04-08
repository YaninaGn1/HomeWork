/*
1.5.4. Ряд Фибоначчи
 */
package home_work_2.Main;
import home_work_2.loops.Zadanie154;

import java.util.Scanner;

public class Zadanie154Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");


        System.out.print(Zadanie154.fib(in.nextInt()));

    }
}

