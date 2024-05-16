package home_work_6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Zadanie2 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите адрес файла");
        String path = console.nextLine();
        File file = new File(path);

        String text = Files.readString(Path.of(path));

        try (BufferedReader buf = new BufferedReader(new FileReader(file))) {
            StringBuilder text1 = new StringBuilder();

            Map<String, Word> countMap = new HashMap<String, Word>();

            String line;
            while ((line = buf.readLine()) != null) {
                String[] words = line.split("[{|}| +|\"|'|!|-|;|. |)|(|@|#|$|^|]|-+|,");
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
