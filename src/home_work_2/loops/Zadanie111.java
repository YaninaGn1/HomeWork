/*
Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    	1.1.1. Используя только цикл
 */
package home_work_2.loops;

import java.util.Scanner;
public class Zadanie111 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int n = in.nextInt();
        int i = 1;
        int proiz = 1;
        if (n > 0) {
             while (i <= n) {
                 proiz = proiz * i;
                 i++;
             }
            System.out.println("Произведение " + proiz);
        } else {
        System.out.println("Неправильные данные " );
         }
    }
}


