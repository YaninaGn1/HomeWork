package home_work_5.nick;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 3. Для клички:
 * 	3.1 Генерировать рандомную строку (не важно из чего состоит)+
 * 	3.2 Генерировать рандомную строку (состоящую из русских букв)+
 * 	3.3 Генерировать рандомное имя (настоящие клички животных)+
 * 	3.4* Генерировать рандомное имя (клички получать из файла)
 */
public class NickAnimal {
    static String name1 (){
        Random rnd =  new Random();
        String n1 = rnd.toString();
        return n1;
    }
   public static  String  name2 () {
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

        List<String> name31 = Arrays.asList("Анатолий", "Игнат", "Люцифер", "Ярик");
        Random rnd = new Random();
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
