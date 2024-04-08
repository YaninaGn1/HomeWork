package home_work_2.loops;
import java.util.Random;
public class Zadanie152 {
    /**
     * 1.5.2. Вероятность четных случайных чисел
     */
   private static int i;
   private static int i1 = 0;
   private static int v = 0;
    private static int x = 100;

    public static int rnd(){

        for (i = 0;i < 1000;i++) {
        int k = v + (int) (Math.random() * x);
        if (k % 2 == 0) {
            i1 += 1;
        }
    }

        return i1;
    }
}
