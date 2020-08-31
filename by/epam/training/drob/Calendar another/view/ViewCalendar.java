package view;

import entity.Calendar;

public class ViewCalendar {
    public void viewDay(Calendar calendar, Calendar.Day day) {
        System.out.println(day.toString());
    }
}
