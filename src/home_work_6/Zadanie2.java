package home_work_6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Zadanie2 {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("E://Java//Война и мир_книга.txt");
             BufferedReader buf = new BufferedReader(reader)) {
            StringBuilder text = new StringBuilder();

            String[] array = text.toString().split(" " );



            Map<String, Word> countMap = new HashMap<String, Word>();

            String line;
            while ((line = buf.readLine()) != null) {
                String[] words = line.split("[{|}| |\"|'|!|)|(|@|#|$|^|]");
                for (String word : words) {
                    if ("".equals(word)) {
                        continue;
                    }

                    Word wordObj = countMap.get(word);
                    if (wordObj == null) {
                        wordObj = new Word();
                        wordObj.word = word;
                        wordObj.count = 0;
                        countMap.put(word, wordObj);
                    }
                    wordObj.count++;
                }
            }
            ArrayList<Map.Entry<String, Word>> list = new ArrayList<>(countMap.entrySet());
            Comparator<Map.Entry<String, Word>> comparator = (o1, o2) -> o2.getValue().getCount() - o1.getValue().getCount();
            list.sort(comparator );
            Scanner in = new Scanner(System.in);
            System.out.println("Сколько слов нужно вывести?");
            int N = in.nextInt();

            for (int i = 0; i < N; i++) {
                System.out.println(list.get(i).getKey() + " - " + list.get(i).getValue().getCount()  );
            }

        } catch (FileNotFoundException e) {
            System.out.println("Нет такого файла"+e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class Word {
        String word;
        int count;

        public int getCount(){
            return count;
        }


    }
}
