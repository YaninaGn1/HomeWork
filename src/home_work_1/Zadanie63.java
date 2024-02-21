package home_work_1;

import java.util.Scanner;

public class Zadanie63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("write name ");
        String name1 = in.nextLine();

        switch (name1){
            case "Вася":
                System.out.println("Привет");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.print("Добрый день, а вы кто?");
        }
    }
}
