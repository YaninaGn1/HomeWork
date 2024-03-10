/*
1.5.4. Ряд Фибоначчи
 */
package loops;
import java.util.Scanner;
public class Zadanie154 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int n = in.nextInt();

        int n1 = 1;
        int n2 = 1;
        int n3;
        System.out.print(n1 + "" + n2 + "");

       for (int i = 3; i <= n; i++) {
           n3 = n2 + n1;
           System.out.print(" " + n3);
           n1 = n2;
           n2 = n3;
            }
                System.out.println();
    }
}

