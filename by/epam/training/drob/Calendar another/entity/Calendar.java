package entity;


import logic.CalendarLogic;

import java.util.List;

public class Calendar {
    Day day;

    public class Day {
        private int year;
        private int month;
        private int dayOfMonth;
        private DayOfWeek dayOfWeek;
        private boolean isHoliday = false;
        private String nameOfHolyDay = "check this day";

        public Day(int year, int month, int dayOfMonth) {
            this.year = year;
            this.month = month;
            this.dayOfMonth = dayOfMonth;
            this.dayOfWeek = CalendarLogic.checkDayOfWeek(year, month, dayOfMonth);

        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDayOfMonth() {
            return dayOfMonth;
        }

        public void setDayOfMonth(int dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
        }

        public DayOfWeek getDayOfWeek() {
            return dayOfWeek;
        }


        public boolean getIsHoliday() {
            return isHoliday;
        }

        public void setIsHoliday(boolean holiday) {
            isHoliday = holiday;
        }

        public String getNameOfHolyDay() {
            return nameOfHolyDay;
        }

        public void setNameOfHolyDay(String nameOfHolyDay) {
            this.nameOfHolyDay = nameOfHolyDay;
        }

        @Override
        public String toString() {
            return "year=" + year +
                    ", month=" + month +
                    ", dayOfMonth=" + dayOfMonth +
                    ", dayOfWeek=" + dayOfWeek +
                    ", isHoliday=" + isHoliday +
                    ", nameOfHolyDay=" + nameOfHolyDay;
        }
    }

}