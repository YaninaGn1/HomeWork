package home_work_1.Main;
import home_work_1.Adanie41;

import java.util.Scanner;

public class adanie41Main {
private double a;

    public static void main(String[] args) {
        /** Ввод с консоли числа а
          */
        Scanner in = new Scanner(System.in);
        System.out.print("Input  a: ");


       System.out.print( Adanie41.chetnost( in.nextDouble()) + " " + " - Остаток от деления на 2 ");
    }

    }


