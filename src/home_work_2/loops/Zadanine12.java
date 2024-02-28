/*
1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
 */
package loops;

import java.util.Scanner;
public class Zadanine12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");

        int proiz = 1;
        int k;
        if (in.hasNextInt()){
            int i = in.nextInt();
            while (i > 0) {
                k = i % 10;
                proiz = proiz * k;
                i = i / 10;
            }
            System.out.println("Произведение = " + proiz);
        }
        if (in.hasNextDouble()) {
            System.out.println("Введено не целое число");
        } else if (in.hasNextLine()) {
            System.out.println("Введено не  число");
        }
    }

}

