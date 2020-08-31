package logic;

import entity.*;


public class CalendarLogic {
    public void CheckIsHoliday(Calendar.Day day) {

        if (day.getDayOfMonth() == 01 && day.getMonth() == 01) {
            day.setIsHoliday(true);
            day.setNameOfHolyDay("New Year");
        } else if (day.getDayOfMonth() == 07 && day.getMonth() == 01) {
            day.setIsHoliday(true);
            day.setNameOfHolyDay("Christmas");
        } else if (day.getDayOfMonth() == 8 && day.getMonth() == 03) {
            day.setIsHoliday(true);
            day.setNameOfHolyDay("8 March");
        } else if (day.getDayOfMonth() == 01 && day.getMonth() == 05) {
            day.setIsHoliday(true);
            day.setNameOfHolyDay("1st May");
        } else if (day.getDayOfMonth() == 9 && day.getMonth() == 05) {
            day.setIsHoliday(true);
            day.setNameOfHolyDay("9 May");
        } else if (day.getDayOfMonth() == 03 && day.getMonth() == 07) {
            day.setIsHoliday(true);
            day.setNameOfHolyDay("3 July");
        } else if (day.getDayOfMonth() == 07 && day.getMonth() == 11) {
            day.setIsHoliday(true);
            day.setNameOfHolyDay("day of the October revolution");
        } else if (day.getDayOfMonth() == 25 && day.getMonth() == 12) {
            day.setIsHoliday(true);
            day.setNameOfHolyDay("Christmas");
        }

        if (day.getDayOfWeek() == DayOfWeek.SATURDAY || day.getDayOfWeek() == DayOfWeek.SUNDAY) {
            if (!day.getIsHoliday()) {
                day.setIsHoliday(true);
                day.setNameOfHolyDay("just holiday");
            }

        }

    }

    public static boolean isLeap(int year) {// проверка является ли год високосным
        return year % 4 == 0;
    }


    public static entity.DayOfWeek checkDayOfWeek(int year, int month, int dayOfMonth) { //Только для 21 века
        DayOfWeek dayOfWeek = null;
        int day;
        int codeMonth;
        int codeYear;


        codeYear = (6 + (dayOfMonth % 100) + (year % 100 / 4)) % 7;
        codeMonth = 0;

        // вычисляется код месяца

        switch (month) {

            case 1:
            case 10:
                codeMonth = 1;
                break;
            case 2:
            case 11:
            case 3:
                codeMonth = 4;
                break;
            case 4:
            case 7:
                codeMonth = 0;
                break;
            case 5:
                codeMonth = 2;
                break;
            case 6:
                codeMonth = 5;
                break;
            case 8:
                codeMonth = 3;
                break;
            case 9:
            case 12:
                codeMonth = 6;
                break;

            default:
                System.out.println("incorrect date");
                break;
        }

        day = (dayOfMonth + codeMonth + codeYear) % 7;

        // формула выше не совсем корректна для января/февраля високосного года. Ниже корректировка.

        if (isLeap(year) && month <= 2) {
            day = day - 1;
            if (day < 0) {
                day = 6;
            }
        }

        switch (day) {

            case 1:
                dayOfWeek = entity.DayOfWeek.SUNDAY;
            case 2:
                dayOfWeek = entity.DayOfWeek.MONDAY;
            case 3:
                dayOfWeek = entity.DayOfWeek.TUESDAY;
            case 4:
                dayOfWeek = entity.DayOfWeek.WEDNESDAY;
            case 5:
                dayOfWeek = entity.DayOfWeek.THURSDAY;
            case 6:
                dayOfWeek = entity.DayOfWeek.FRIDAY;
            case 0:
                dayOfWeek = entity.DayOfWeek.SATURDAY;
        }
        return dayOfWeek;
    }
}
