package home_work_6;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    private int kolRaz = 0;
    @Override
    public long search(String text, String word) {
        Pattern pattern = Pattern.compile("(^|[^а-яА-ЯёЁ_])" + word + "(?![а-яА-ЯёЁ_])",
                Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE );
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            kolRaz++;
        }
        return kolRaz;
    }
}
