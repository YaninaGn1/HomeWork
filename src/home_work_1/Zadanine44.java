package home_work_1;

import java.util.Scanner;

public class Zadanine44 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input  a: ");
        int a = in.nextInt();

        System.out.print("Если нужно перевести в килобайты, введите 1, иначе 2 ");
        int k = in.nextInt();


        if (k == 1){
            System.out.print("Колличество килобайт " + (a * 1024) );
        }  else{
            System.out.print("Колличество байт " + (a / 1024) );
        }
    }

}
