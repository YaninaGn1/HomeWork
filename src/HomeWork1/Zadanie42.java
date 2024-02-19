package HomeWork1;
import java.util.Scanner;

public class Zadanie42 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input  a: ");
        int a = in.nextInt();

        System.out.print("Input  b ");
       int b = in.nextInt();

        System.out.print("Input  c ");
        int c = in.nextInt();

        if (b < c & b > a){
            System.out.println("среднее " + b);
        } else if (b < a & a < c){

                System.out.println("среднее " + a);
            } else {
                System.out.println("среднее " + c);
            }
        }

    }

