package home_work_1.Main;
import home_work_1.Zadanie42;

import java.util.Scanner;

public class Zadanie42Main {
    /**
     * 4.2 Среди трёх чисел найти среднее
     * вернуть 1, если среднее число №2;
     * вернуть 0, если среднее число №1;
     * вернуть -1, если среднее число №3;
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("введите три числа ");
        System.out.print(Zadanie42.srednie(in.nextInt(),in.nextInt(),in.nextInt()));
        }

    }

