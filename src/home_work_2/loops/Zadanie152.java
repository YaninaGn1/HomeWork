package home_work_2.loops;
import java.util.Random;
public class Zadanie152 {
    public static void main(String[] args) {
        int i;

        Random rnd = new Random (1000);
        int k = rnd.nextInt();

        for (i = 1;i <= 1000;) {
            if (k % 2 == 0) {
                i = i++;
            } else {
                System.out.println("Нет четных чисел ");
            }
        }
    }
}
