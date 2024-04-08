/*
Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    	1.1.1. Используя только цикл
 */
package home_work_2.Main;

import home_work_2.loops.Zadanie111;

import java.util.Scanner;
public class Zadanie111Main {
     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int n = in.nextInt();


        System.out.print(Zadanie111.umnozenie(n));
    }

}


