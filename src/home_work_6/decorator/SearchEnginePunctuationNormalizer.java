package home_work_6.decorator;

import home_work_6.api.ISearchEngine;

public abstract class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }
    @Override
    public long search(String text, String word) {
        text = text.replaceAll("[!|@|_|$|%|^|&|*|?|~|(|)|<|>|:|/|'|\"]"," ");
        return searchEngine.search(text, word);
    }
}
