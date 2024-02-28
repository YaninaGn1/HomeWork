/*1.5.6. Переворот числа

 */
package loops;

public class Zadanina156 {
    public static void main(String[] args) {
        int n = 123;

        int reversedNumber = 0;

        while(n != 0) {
            reversedNumber = reversedNumber * 10 + n % 10;
            n /= 10;
        }
        System.out.println(reversedNumber);
    }
}
