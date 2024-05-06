package home_work_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine{
    private int kolRaz = 0;
    @Override
    public long search(String text, String word) {
        Pattern pattern = Pattern.compile(text);
        Matcher matcher = pattern.matcher(word);

        while (matcher.find()) {
            kolRaz++;
        }
        return kolRaz;
    }
}
