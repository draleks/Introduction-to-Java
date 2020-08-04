package logic;
import entity.*;

import java.time.DayOfWeek;

public class CalendarLogic {
    public void addHolyDay(Calendar calendar, Calendar.HolyDay day){
        calendar.getListOfHolyDays().add(day);
    }
    public void addDay(Calendar calendar, Calendar.Day day){
        calendar.getListOfDays().add(day);
        if(day.getDayOfWeek()== DayOfWeek.SATURDAY||day.getDayOfWeek()== DayOfWeek.SUNDAY){
            calendar.getListOfHolyDays().add((Calendar.HolyDay)day);
        }
    }
    public void isHoliday(Calendar.Day day) {

        if (day.getDayOfMonth() == 01 && day.getMonth() == 01) {
            System.out.println("Новый Год");
            return;
        } else if (day.getDayOfMonth()  == 07 && day.getMonth() == 01) {
            System.out.println("Рождество Христово.");
            return;
        } else if (day.getDayOfMonth()  == 8 && day.getMonth() == 03) {
            System.out.println("Международный женский День");
            return;
        } else if (day.getDayOfMonth()  == 01 && day.getMonth() == 05) {
            System.out.println("Праздник труда");
            return;
        } else if (day.getDayOfMonth()  == 9 && day.getMonth() == 05) {
            System.out.println("День Победы");
            return;
        } else if (day.getDayOfMonth()  == 03 && day.getMonth() == 07) {
            System.out.println("День Независимости Республики Беларусь.");
            return;
        } else if (day.getDayOfMonth()  == 07 && day.getMonth() == 11) {
            System.out.println("День Октябрьской революции.");
            return;
        } else if (day.getDayOfMonth()  == 25 && day.getMonth() == 12) {
            System.out.println("Рождество Христово (католическое).");
            return;
        }

        if (day.getDayOfWeek()== DayOfWeek.SATURDAY||day.getDayOfWeek()== DayOfWeek.SUNDAY) {
            System.out.println("выходной");
            return;
        }

        System.out.println("рабочий день.");

    }
}
