package home_work_6;

public class EasySearch implements ISearchEngine {
    private int kolRaz = 0;

       @Override
    public long search(String text, String word) {
        int index = 0;

           while (index < text.length() && index != -1) {
               index = text.indexOf(word, index);
               if (index == -1 && kolRaz == 0){
                   System.out.println("В тексте нет такого слова");
                   return -1;
               } else
               if (index == -1){
                   return kolRaz;
               }
               index = index + word.length() + 1;
               kolRaz++;
           }
            
        return kolRaz;
    }
}
