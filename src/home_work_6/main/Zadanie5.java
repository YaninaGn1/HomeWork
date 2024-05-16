package home_work_6.main;

import home_work_6.EasySearch;
import home_work_6.api.ISearchEngine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите адрес файла");
        String path = console.nextLine();

        String str;
        try  {

            String text = Files.readString(Path.of(path));

            EasySearch searchEngine = new EasySearch();

       //     long count1= searchEngine.search(text, "мир");
        //    print( "мир", count1);

       //     long count2 = searchEngine.search(text, "и");
        //    print( "и", count2);

            long count3 = searchEngine.search(text, "война");
            print( "война", count3);

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
