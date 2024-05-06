package home_work_6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

public class Zadanie_2_1 {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("E://Java//Война и мир_книга.txt");
             BufferedReader buf = new BufferedReader(reader)) {
            StringBuilder text = new StringBuilder();

            String line;
            while ((line = buf.readLine()) != null) {
                text.append(line);
            }

            String[] array = text.toString().split(" ");

            HashSet<String> words = new HashSet<>(List.of(array));
            for (String word : array) {
                words.add(word);
            }
            System.out.print(words.size());


        } catch (FileNotFoundException e) {
            System.out.println("Нет такого файла");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
