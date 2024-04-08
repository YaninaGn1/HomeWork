/*
Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    	1.1.1. Используя только цикл
 */
package test.home_work_2.loops;

import home_work_2.loops.Zadanie111;
import org.junit.jupiter.api.Test;

public class Zadanie111Test {
    @Test
    public void testNull() {
        Zadanie111 zadanie111 = new Zadanie111();
        double schet = Zadanie111.umnozenie(0);
    }
}


