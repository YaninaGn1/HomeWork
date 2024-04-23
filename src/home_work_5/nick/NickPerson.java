package home_work_5.nick;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * 4. Для псевдонимов:
 * 	4.1 Генерировать рандомную строку (не важно из чего состоит)+
 * 	4.2 Генерировать рандомную строку (состоящую из анлийских букв)+
 * 	4.3* Генерировать рандомное имя (псевдонимы получать из файла)
 */
public class NickPerson {
    static String name1 (){
        Random rnd =  new Random();
        String n1 = rnd.toString();
        return n1;
    }
    public static String   name2 () {
        char start = 'A';
        char stop = 'z';
        int stringLength = 10;

        Random rnd = new Random();

        String generatedString = rnd.ints(start, stop +1 )
                .limit(stringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
       return generatedString;
    }


    @Test
    public void test1(){
        System.out.print(name1());
    }

    @Test
    public void test2(){
        System.out.print(name2());
    }
}
