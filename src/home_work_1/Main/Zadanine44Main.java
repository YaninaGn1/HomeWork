package home_work_1.Main;

import home_work_1.Zadanine44;

import java.util.Scanner;

public class Zadanine44Main {
    private static double a ;

    /** 4.4 Перевести байты в килобайты или наоборот
     *  вернуть  0.0 если перевод удался
     *  вернуть  -1.0 если перевод не удался
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число");

        System.out.print(Zadanine44.perevod(in.nextInt()));
    }

}
