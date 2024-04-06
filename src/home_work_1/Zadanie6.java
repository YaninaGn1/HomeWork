package home_work_1;
import java.util.Objects;
import home_work_1.api.ICommunicationPrinter;

public class Zadanie6  implements ICommunicationPrinter {
    private  String name ;

    /**
     * 1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке, а на второй "Я тебя так долго ждал".
     * 		2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
     * 		3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
     */
    public String welcom(String name){

        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");

        } else {
            if(Objects.equals(name, "Анастасия")){
                System.out.println("Я тебя так долго ждал");

            } else {
                System.out.println("Добрый день, а вы кто?");
            }

        }
        System.out.println("______");
        return null;
    }

}



