package home_work_5.runners;

import home_work_5.service.EasySearch;
import home_work_5.service.WarAndPeace;

public class WarAndPeaceMain {

    public static void main(String[] args) {
        WarAndPeace work = new WarAndPeace();
        EasySearch finder = new EasySearch();
        //work.textSetPrint();
        //work.wordsTop(5);
        System.out.println("Слово 'война' встречается - " + finder.searchFile("book.txt", "Война") + " раза");
        System.out.println("Союз 'и' встречается - " + finder.searchFile("book.txt", "И") + " раза");
        System.out.println("Слово 'мир' встречается - " + finder.searchFile("book.txt", "Мир") + " раза");
    }


}
