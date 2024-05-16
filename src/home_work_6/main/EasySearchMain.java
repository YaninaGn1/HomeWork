package home_work_6.main;
import home_work_6.EasySearch;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class EasySearchMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите адрес файла");
        String path = console.nextLine();

            try {
                String text = Files.readString(Path.of(path));

                EasySearch searchEngine = new EasySearch();

                long count = searchEngine.search(text, "мир");
                long count1 = searchEngine.search(text, "война");
                long count2 = searchEngine.search(text, "и");

                System.out.println("Слово мир встречается:" +count + " раз");
                System.out.println("Слово война встречается: " +count1 + " раз");
                System.out.println("Союз и встречается: " +count2 + " раз");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
