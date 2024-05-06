package home_work_6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Zadanie5 {
    public static void main(String[] args) {
        String str;
        try (FileReader reader = new FileReader("E://Java//Война и мир_книга.txt");
             BufferedReader buf = new BufferedReader(reader)) {
            StringBuilder text = new StringBuilder();

            String line;
            while ((line = buf.readLine()) != null) {
                text.append(line);
            }
             str = text.toString();

            EasySearch es = new EasySearch();
            long slovo1 = es.search( str, "война");
            print("война", slovo1);

            long slovo2 = es.search( str,  " и ");
            print( "и", slovo2);

            long slovo3 = es.search( str,  "мир");
            print( "мир", slovo3);

        } catch (FileNotFoundException e) {
            System.out.println("Нет такого файла");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

   static void print(String word, long x){
            System.out.println("Слово \"" + word + "\" встречается " + x + " раз");
    }


}
