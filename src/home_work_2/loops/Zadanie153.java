/*
1.5.3. Посчитать четные и нечетные цифры числа
 */

package loops;
import java.util.Scanner;
public class Zadanie153 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int i = in.nextInt();

        int chetnoje = 0;
        int nechetnoje = 0;

        while (i > 0) {
            if (i % 2 == 0) {
                chetnoje++;
            } else {
                nechetnoje++;
            }
            i = i / 10;
        }
                System.out.println("Нечетное " + nechetnoje);
                System.out.println("Четное " + chetnoje);


    }
}
