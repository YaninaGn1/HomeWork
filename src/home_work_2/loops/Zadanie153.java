/*
1.5.3. Посчитать четные и нечетные цифры числа
 */

package home_work_2.loops;

public class Zadanie153 {
   private static int chetnoje = 0;

    private static int nechetnoje = 0;

    public static String  kolichestvo(int i) {

        while (!(i == 0)) {
            if (i % 2 == 0) {
                chetnoje = chetnoje + 1;
            } else {
                nechetnoje = nechetnoje + 1;
            }
            i = i / 10;
        }

        return ("chetnoje =" + chetnoje + " "+"nechetnoje =" +  nechetnoje);

    }
}
