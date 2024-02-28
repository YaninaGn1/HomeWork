/*
1.5.1. Найти наибольшую цифру натурального числа
 */

package loops;
import java.util.Scanner;
public class Zadanie151 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int i = in.nextInt();
        int max;

        if (i <= 0) {
            System.out.print("Некорректные данные ");
        } else {
            max = i % 10;
            i = i / 10;
            while (i % 10 > max) {
                max = i % 10;
                i = i / 10;
                System.out.print("max " + max);
            }
            System.out.print("max " + max);
        }
    }
}
