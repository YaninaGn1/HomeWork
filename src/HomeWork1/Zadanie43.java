package HomeWork1;
import java.util.Scanner;

public class Zadanie43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input  a: ");
        int a = in.nextInt();

        System.out.print("Input  b ");
        int b = in.nextInt();

        if (a % b == 0){
            System.out.print("chisla Delyatsa" );
            } else {
            System.out.print("chisla Ne Delyatsa" );
        }
    }
}
