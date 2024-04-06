package home_work_1.Main;

import home_work_1.Zadanie43;

import java.util.Scanner;

public class Zadanie43Main {
    /**.
     * 4.3 Проверка делимости одного числа на другое
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите два числа ");


        System.out.println(Zadanie43.delimost(in.nextInt(),in.nextInt()) + "" );
    }
}
