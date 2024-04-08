/*1.5.6. Переворот числа

 */
package home_work_2.loops;

public class Zadanina156 {
    private static int reversedNumber = 0;
    public static int perevorot(int n) {
        while(n != 0) {
            reversedNumber = reversedNumber * 10 + n % 10;
            n /= 10;
        }
        System.out.println(reversedNumber);
                return reversedNumber;
    }
}
