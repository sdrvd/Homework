package home_work_5.tests;

import home_work_5.service.EasySearch;
import org.junit.Assert;
import org.junit.Test;

public class EasySearchTests {

    @Test
    public  void searchFileTest(){
        EasySearch finder = new EasySearch();
        long testLong = finder.searchFile("C:/Users/Дангер/JD1/book.txt", "война");
        Assert.assertEquals(52, testLong);
    }

    @Test
    public void easyFindTest(){
        EasySearch finder = new EasySearch();
        boolean easyFindBool = finder.easyFind("Интервьюер интервента интервьюировал", "интервента");
        Assert.assertTrue(easyFindBool);
    }

    @Test
    public void searchTextTest(){
        EasySearch finder = new EasySearch();
        long testLong = finder.searchText("Работники предприятие приватизировали-приватизировали, да не выприватизировали.", "работники");
        Assert.assertEquals(1, testLong);
    }

    @Test
    public void RegExSearchTest(){
        EasySearch finder = new EasySearch();
        long testLong = finder.RegExSearch("Николай, Николай, Николай, Николай, николай, коля", "Николай");
        Assert.assertEquals(4, testLong);
    }
}
