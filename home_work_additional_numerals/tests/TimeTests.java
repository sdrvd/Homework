package home_work_additional_numerals.tests;

import home_work_additional_numerals.service.Time;
import org.junit.Assert;
import org.junit.Test;

public class TimeTests {

    @Test
    public void toWeekTest(){
        Time time = new Time();
        String timeString = time.toWeek(55);
        Assert.assertEquals("7 недель", timeString);
    }

    @Test
    public void toHoursMinuteSecondMillisecondTest(){
        Time time = new Time();
        String timeString = time.toHoursMinuteSecondMillisecond(921521, false);
        Assert.assertEquals("0 часов 15 минут 21 секунда 521 миллисекунда", timeString);
    }

    @Test
    public void toHoursMinuteSecondMillisecondShortTest(){
        Time time = new Time();
        String timeString = time.toHoursMinuteSecondMillisecond(921521, true);
        Assert.assertEquals("00:15:21.521", timeString);
    }
}
