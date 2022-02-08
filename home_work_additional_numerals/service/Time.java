package home_work_additional_numerals.service;

import home_work_additional_numerals.api.ITime;

public class Time implements ITime {
    @Override
    public String toWeek(int day) {
        int holder = day / 7;
        int lastNumber = holder;
        String weekOutput;
        if(lastNumber > 10){
            lastNumber %= 10;
        }
        switch(lastNumber) {
            case 1:
                weekOutput = holder + " неделя";
                break;
            case 2:
                weekOutput = holder + " недели";
                break;
            case 3:
                weekOutput = holder + " недели";
                break;
            case 4:
                weekOutput = holder + " недели";
                break;
            default:
                weekOutput = holder + " недель";
                break;
        }
        return weekOutput;
    }

    @Override
    public String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {
        String output = "";
        long hours = millisecond / 3_600_000;
        String hoursShort;
        long surplus = millisecond % 3600000;
        long minutes = surplus / 60_000;
        String minutesShort;
        surplus %= 60_000;
        long seconds = surplus / 1000;
        String secondsShort;
        surplus %= 1000;
        long milisec = surplus;
        String milisecShort = null;
        if (!shortFormat) {
            long lastHourNumber = hours % 10;
            long lastMinuteNumber = minutes % 10;
            long lastSecondsNumber = seconds % 10;
            long lastMilisecNumber = milisec % 10;
            switch((int) lastHourNumber){
                case 1:
                    output += hours + " час ";
                    break;
                case 2:
                    output += hours + " часа ";
                    break;
                case 3:
                    output += hours + " часа ";
                    break;
                case 4:
                    output += hours + " часа ";
                    break;
                default:
                    output += hours + " часов ";

            }
            switch ((int) lastMinuteNumber){
                case 1:
                    output += minutes + " минута ";
                    break;
                case 2:
                    output += minutes + " минуты ";
                    break;
                case 3:
                    output += minutes + " минуты ";
                    break;
                case 4:
                    output += minutes + " минуты ";
                    break;
                default:
                    output += minutes + " минут ";
            }
            switch((int) lastSecondsNumber){
                case 1:
                    output += seconds + " секунда ";
                    break;
                case 2:
                    output += seconds + " секунды ";
                    break;
                case 3:
                    output += seconds + " секунды ";
                    break;
                case 4:
                    output += seconds + " секунды ";
                    break;
                default:
                    output += seconds + " секунд ";
            }
            switch((int) lastMilisecNumber){
                case 1:
                    output += milisec + " миллисекунда";
                    break;
                case 2:
                    output += milisec + " миллисекунды";
                    break;
                case 3:
                    output += milisec + " миллисекунды";
                    break;
                case 4:
                    output += milisec + " миллисекунды";
                    break;
                default:
                    output += milisec + " миллисекунд";
            }
        }
        if(shortFormat){
                hoursShort = "0" + hours;
                minutesShort = "0" + minutes;
                secondsShort = "0" + seconds;
                if(milisec < 100){
                    milisecShort = "0" + milisec;
                }
                if(milisec < 10){
                    milisecShort = "00" + milisec;
                }
                if(hours < 10){
                    output += hoursShort + ":";
                } else {
                    output += hours + ":";
                }
                if(minutes < 10){
                    output += minutesShort + ":";
                } else {
                    output += minutes + ":";
                }
                if(seconds < 10){
                    output += secondsShort;
                } else {
                    output += seconds;
                }
                if(milisec < 10 || milisec < 100){
                    output += "." + milisecShort;
                } else {
                    output += "." + milisec;
                }
        }
        return output;
    }
}
