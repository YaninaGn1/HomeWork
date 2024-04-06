package test.home_work_1;
import home_work_1.Zadanie6;
import org.junit.jupiter.api.Test;

public class Zadanie6Test {

    /**
     * 1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке, а на второй "Я тебя так долго ждал".
     * 		2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
     * 		3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
     */
    Zadanie6 zadanie6 = new Zadanie6();

    @Test
    public void  test1(){
        String a = zadanie6.welcom(" ");
    }

    @Test
    public void  test2(){
        String a = zadanie6.welcom("Анастасия");
    }

    @Test
    public void  test3(){
        String a = zadanie6.welcom("Yana");
    }
}



