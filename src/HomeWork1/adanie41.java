package HomeWork1;
import java.util.Scanner;

public class adanie41 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input  a: ");
       double a = in.nextDouble();

        if (a % 2 == 0 ){
            System.out.println(" a - четное");
        } else {
            System.out.println("a - нечетное");
        }
    }
}
