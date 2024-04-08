/*
1.5.3. Посчитать четные и нечетные цифры числа
 */

package home_work_2.Main;
import home_work_2.loops.Zadanie153;

import java.util.Scanner;

public class Zadanie153Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");

        System.out.println(Zadanie153.kolichestvo(in.nextInt()));
    }
}
