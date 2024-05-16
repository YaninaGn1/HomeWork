package home_work_6;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    private final static char[] splitChar = {
            ' ', '\n', ',', '.', '-', '!', '?'
    };

       @Override
       public long search(String text, String word) {
           int textLength = text.length();
           int wordLength = word.length();

           long count = 0;
           int currentPosition = 0;
           while ((currentPosition = text.indexOf(word, currentPosition)) != -1){
               int indexNextCharAfterWord = currentPosition + wordLength;

               boolean needCheckBefore = currentPosition > 0;
               boolean needCheckAfter = indexNextCharAfterWord < textLength;

               boolean charBeforeIsSplit = true;
               boolean charAfterIsSplit = true;


               if(needCheckBefore){
                   charBeforeIsSplit = isSplitChar2(text.charAt(currentPosition-1));
               }

               if(needCheckAfter){
                   charAfterIsSplit = isSplitChar2(text.charAt(indexNextCharAfterWord));
               }

               if(charBeforeIsSplit && charAfterIsSplit){
                   count++;
               }

               currentPosition++;
           }
           return count;
       }

    public boolean isSplitChar(char ch){
        return ch == ' '
                || ch == '\n'
                || ch == ','
                || ch == '.'
                || ch == '-'
                || ch == '!'
                || ch == '?'
                ;
    }

    public boolean isSplitChar2(char ch){
        for (char split : splitChar) {
            if(split == ch){
                return true;
            }
        }

        return false;
    }
}
