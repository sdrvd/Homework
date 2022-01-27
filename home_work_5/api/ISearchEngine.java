package home_work_5.api;

public interface ISearchEngine {
    public long searchFile(String filename, String word);
    public boolean easyFind(String text, String word);
    public long searchText(String text, String word);
    public long RegExSearch(String text, String word);
    public void SearchEnginePunctuationNormalizer(String text);
}
