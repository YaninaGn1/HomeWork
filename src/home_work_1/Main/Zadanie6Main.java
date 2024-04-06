package home_work_1.Main;

import home_work_1.Zadanie6;
import home_work_1.Zadanie63;

public class Zadanie6Main {

    /**
     * 1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке, а на второй "Я тебя так долго ждал".
     * 		2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
     * 		3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
     */
    public static void main(String[] args) {

        Zadanie6 zadanie6 = new Zadanie6();
        System.out.print(zadanie6.welcom("Вася"));
        System.out.print(zadanie6.welcom("Анастасия"));
        System.out.print(zadanie6.welcom("Yana"));

        Zadanie63 zadanie63 = new Zadanie63();
        System.out.print(zadanie63.welcom("Yana"));
        System.out.print(zadanie63.welcom("Вася"));
        System.out.print(zadanie63.welcom("Анастасия"));
    }

}



