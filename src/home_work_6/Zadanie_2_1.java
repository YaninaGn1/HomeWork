package home_work_6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Zadanie_2_1 {
       public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите адрес файла");
        String path = console.nextLine();
        File file = new File(path);

        String text = Files.readString(Path.of(path));


        try (BufferedReader buf = new BufferedReader(new FileReader(file))) {
            StringBuilder text1 = new StringBuilder();

            String line;
            while ((line = buf.readLine()) != null) {
                text1.append(line);
            }

            String[] array = text.toString().split(" +");


            HashSet<String> words = new HashSet<>(List.of(array));

            for (String word : array) {
                words.add(word);
            }
            System.out.println(words);
            System.out.print(words.size());

        } catch (FileNotFoundException e) {
            System.out.println("Нет такого файла");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
