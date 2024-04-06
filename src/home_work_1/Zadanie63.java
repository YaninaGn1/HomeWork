package home_work_1;

import home_work_1.api.ICommunicationPrinter;


public class Zadanie63 implements ICommunicationPrinter {
    public String welcom(String name){

        switch (name){
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
        return null;
    }
}
