/*
Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    	1.1.1. Используя только цикл
 */
package home_work_2.loops;

public class Zadanie111 {

    public  static int  umnozenie(int n) {
        int i = 1;
        int proiz = 1;
        if (n > 0) {
            while (i < n) {
                i++;
                proiz = proiz * i;
                System.out.print(i);

                if (i != n) {
                    System.out.print("*");
                }
            }
            System.out.println( "=" + proiz);
        } else {
            System.out.println("Неправильные данные " );
        }
        System.out.println("______ " );
        return 0;
    }

}


