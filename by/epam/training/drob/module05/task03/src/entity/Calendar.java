package entity;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    Day day;
    HolyDay holyDay;
    List<Day> listOfDays = new ArrayList<>();
    List<HolyDay> listOfHolyDays = new ArrayList<>();

    public class Day {
        private int year;
        private int month;
        private int dayOfMonth;
        private DayOfWeek dayOfWeek;
        private boolean isHoliday = false;

        public Day(int year, int month, int dayOfMonth, DayOfWeek dayOfWeek) {
            this.year = year;
            this.month = month;
            this.dayOfMonth = dayOfMonth;
            this.dayOfWeek = dayOfWeek;
        }

        public void setIsHoliday(boolean isHoliday) {
            this.isHoliday = isHoliday;
        }

        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }

        public int getDayOfMonth() {
            return dayOfMonth;
        }

        public DayOfWeek getDayOfWeek() {
            return dayOfWeek;
        }

        public boolean isHoliday() {
            return isHoliday;
        }
    }

    public class HolyDay extends Day {
        private String nameOfHighDay = "Выходной";

        public HolyDay(int year, int month, int dayOfMonth, DayOfWeek dayOfWeek, String nameOfHighDay) {
            super(year, month, dayOfMonth, dayOfWeek);
            super.setIsHoliday(true);
            this.nameOfHighDay = nameOfHighDay;
        }

        public String getNameOfHighDay() {
            return nameOfHighDay;
        }

        public void setNameOfHighDay(String nameOfHighDay) {
            this.nameOfHighDay = nameOfHighDay;
        }
    }

    public List<Day> getListOfDays() {
        return listOfDays;
    }

    public void setListOfDays(List<Day> listOfDays) {
        this.listOfDays = listOfDays;
    }

    public List<HolyDay> getListOfHolyDays() {
        return listOfHolyDays;
    }

    public void setListOfHolyDays(List<HolyDay> listOfHolyDays) {
        this.listOfHolyDays = listOfHolyDays;
    }

}