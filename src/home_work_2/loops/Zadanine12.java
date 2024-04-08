/*
1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
 */
package home_work_2.loops;

import java.util.Scanner;
public class Zadanine12 {
     private static int proiz = 1;
    private static int k = 10;
    static String message = "";
    private static int i ;

    public static int umnozenieInt(int i){
        for ( i = 1; i <= k; i++) {
            proiz *= i;
            message += i + " * ";
        }

        message = message.substring(0, message.length() - 2);

        System.out.println(message + "= " + k);
        return 0;
    }
    public static double umnozenieDouble(double i){
        System.out.println("Введено не целое число");
        return 1;
    }

    public static String umnozenieString(String  i){
        System.out.println("Введено не  число");
        return ("Введено не  число");
    }
}

