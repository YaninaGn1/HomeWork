package home_work_6.decorator;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class SeachInformatoin implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SeachInformatoin(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }
    @Override
    public long search(String text, String word) {
        String textLine= text.toLowerCase();
        String wordLine = word.toLowerCase();

        return searchEngine.search(textLine, wordLine);
    }
}

