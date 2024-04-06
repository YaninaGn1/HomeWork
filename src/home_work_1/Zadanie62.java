package home_work_1;

import home_work_1.api.ICommunicationPrinter;

import java.util.Objects;
import java.util.Scanner;

public class Zadanie62 implements ICommunicationPrinter {
    private String name;

    public String welcom(String name) {
        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");

        } else {
            if (Objects.equals(name, "Анастасия")) {
                System.out.println("Я тебя так долго ждал");

            } else {
                System.out.println("Добрый день, а вы кто?");
            }

        }
        System.out.println("______");
        return null;
    }
}