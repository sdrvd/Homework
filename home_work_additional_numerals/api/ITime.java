package home_work_additional_numerals.api;

public interface ITime {
    public String toWeek(int day);
    public String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat);
}
