/*
 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить, Второе число это степень в которую возводят первое число. Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
 */

package home_work_2.Main;
import home_work_2.loops.Zadanie13;

import java.util.Scanner;

public class Zadanie13Main {
    private static double k = 1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        double n = in.nextDouble();
        System.out.print("Введите степень ");
        double stepen = in.nextDouble();

        System.out.print(Zadanie13.stepen1(18,5));
    }



}
