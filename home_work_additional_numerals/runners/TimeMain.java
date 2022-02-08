package home_work_additional_numerals.runners;

import home_work_additional_numerals.service.Time;

public class TimeMain {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.toWeek(8812125));
        System.out.println(time.toHoursMinuteSecondMillisecond(413489012, true));
    }
}
