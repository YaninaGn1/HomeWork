package home_work_6.main;

import home_work_6.RegExSearch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class RegExSearchMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите адрес файла");
        String path = console.nextLine();

            try {
                String text = Files.readString(Path.of(path));

                RegExSearch regExSearch = new RegExSearch();

                long count = regExSearch.search(text, "мир");
               long count1 = regExSearch.search(text, "война");
                long count2 = regExSearch.search(text, "и");

                System.out.println("Слово мир встречается: " +count + " раз");
               System.out.println("Слово война встречается: " +count1 + " раз");
                System.out.println("Буква и встречается: " +count2 + " раз");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
