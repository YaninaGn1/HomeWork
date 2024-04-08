/* 1.5.5. Вывести ряд чисел в диапазоне с шагом

 */
package home_work_2.loops;

public class Zadanie155 {
  private static   double i;
    private static   double k;
    public static String shag(double k) {
        for (i = -2; i <=2; ){
            i = i + k;
            System.out.println("i = "+ i);
        }
        return ("");
    }
}
