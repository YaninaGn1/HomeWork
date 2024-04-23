package home_work_5.name;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Для имён:
 * 	2.1 Генерировать рандомную строку (не важно из чего состоит)+
 * 	2.2 Генерировать рандомную строку (состоящую из русских букв)+
 * 	2.3 Генерировать рандомное имя (настоящее имя)+
 * 	2.4* Генерировать рандомное имя (имена получать из файла)
 */
public class Name {

    static String name1 (){
        Random rnd =  new Random();
        String n1 = rnd.toString();
        return n1;
    }
   public static String   name2 () {
        char start = 'А';
       char stop = 'я';
        int stringLength = 10;

        Random rnd = new Random();

         String generatedString = rnd.ints(start, stop +1 )
                .limit(stringLength)
                 .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
    public static String name3 () {
        Random rnd = new Random();
        List<String> name31 = Arrays.asList("Yana", "Kate", "Bob", "Ewa", "ALEX");
        String name = name31.get(rnd.nextInt(name31.size()));
        return name;
    }

    @Test
    public void test1(){
        System.out.print(name1());
    }

    @Test
    public void test2(){
        System.out.print(name2());
    }

    @Test
    public void test3(){
        System.out.print(name3());
    }

}
