/*
 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить, Второе число это степень в которую возводят первое число. Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
 */

package home_work_2.loops;
import java.util.Scanner;
public class Zadanie13 {
    private static double k = 1;

public static int stepen1(double n, double stepen ){
        if (stepen <= 0) {
            System.out.print("Ввели неправильные данные ");
        } else if (stepen % 1 == 0){
            for (int i = 1; i <= stepen; i++) {
                k = k * n;
            }
            System.out.println("Произведение = " +k);
              } else {
            System.out.println("Ввели неправильные данные ");
            }
        return 0;
    }

}
