package view;

import entity.Calendar;

public class ViewCalendar {
    public void printCalendarDayOff(Calendar calendar){
        for ( Calendar.Day day :calendar.getListOfHolyDays()) {
                System.out.println(day.toString());
        }
    }
}
