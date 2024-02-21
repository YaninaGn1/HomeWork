package home_work_1;

import java.util.Scanner;

public class Zadanie62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("write name ");
        String name1 = in.nextLine();

        String name = "Вася";
        String name2 = "Анастасия";

        if (name.equals(name1)) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        } else  if (name2.equals(name1)){
            System.out.println("Я тебя так долго ждал");
        }else {
            System.out.print("Добрый день, а вы кто?");
        }
    }
    }