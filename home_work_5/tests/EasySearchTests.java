package home_work_5.tests;

import home_work_5.service.EasySearch;
import org.junit.Assert;
import org.junit.Test;

public class EasySearchTests {

    @Test
    public  void searchFileTest(){
        EasySearch finder = new EasySearch();
        long testLong = finder.searchFile("book.txt", "война");
        Assert.assertEquals(testLong = 52, testLong);
    }

    @Test
    public void easyFindTest(){
        EasySearch finder = new EasySearch();
        boolean easyFindBool = finder.easyFind("Интервьюер интервента интервьюировал", "интервента");
        Assert.assertEquals(easyFindBool, easyFindBool);
    }

    @Test
    public void searchTextTest(){
        EasySearch finder = new EasySearch();
        long testLong = finder.searchText("Работники предприятие приватизировали-приватизировали, да не выприватизировали.", "Приватизировали");
        Assert.assertEquals(testLong = 2, testLong);
    }
}
