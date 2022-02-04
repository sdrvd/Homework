package home_work_5.service;

import home_work_5.api.ISearchEngine;

import javax.net.ssl.SNIMatcher;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasySearch implements ISearchEngine {

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    @Override
    public long searchFile(String text, String word) {
        int counter = 0;
        word = word.toLowerCase(Locale.ROOT);
        try {
            text = readUsingFiles(text);
            text = text.replaceAll("[.,?!)(\";:-]", "");
            String data[] = text.split("[\\s]");
            for (int i = 0; i < data.length; i++) {
                data[i] = data[i].toLowerCase(Locale.ROOT);
            }

            for (int i = 0; i < data.length; i++) {
                if (data[i].equals(word)){
                    counter++;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return counter;
    }

    @Override
    public boolean easyFind(String text, String word) {
        int counter = text.indexOf(word);
        if(counter >= 0){
            return true;
        }
        return false;
    }

    @Override
    public long searchText(String text, String word) {
        int counter = 0;
        word = word.toLowerCase(Locale.ROOT);
        text = text.replaceAll("[.,?!)(\";:-]", "");
        String data[] = text.split("[\\s]");
            for (int i = 0; i < data.length; i++) {
                data[i] = data[i].toLowerCase(Locale.ROOT);
            }

            for (int i = 0; i < data.length; i++) {
                if (data[i].equals(word)){
                    counter++;
                }
            }
        return counter;
    }

    @Override
    public long RegExSearch(String text, String word) {
        int cnt = 0;
        Pattern pattern = Pattern.compile(word);
        text = text.replaceAll("[.,?!)(\";:-]", "");
        String data[] = text.split("[\\s]");
        for (int i = 0; i < data.length; i++) {
            Matcher matcher = pattern.matcher(data[i]);
            boolean matches = matcher.matches();
            if(matches){
                cnt++;
            }
        }
        return cnt;
    }

    @Override
    public void SearchEnginePunctuationNormalizer(String text) {

    }
}
