import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;


public class Calendar {
    private LocalDate day;
    private Holiday holiday;
    private ArrayList<LocalDate> listOfDays;
    private ArrayList<Holiday> listOfHolidays = new ArrayList<>();
    private int year;

    public Calendar(int year) {
        this.year = checkYear(year);
    }

    public int checkYear(int year) {
        if (year <= 0) {
            return 2020;
        } else {
            return year;
        }
    }

    public void createListOfDays() {
        listOfDays = new ArrayList<>();
        for (int i = 1; i <= LocalDate.of(getYear(), 12, 31).getDayOfYear(); i++) {

            listOfDays.add(LocalDate.ofYearDay(getYear(), i));
        }
    }

    public void showAllDays() {
        for (LocalDate day : listOfDays) {
            System.out.println(day + "   " + day.getDayOfWeek());
        }
    }

    private class Holiday {
        private LocalDate holiday;
        private String description;
        String dayOfWeek;

        public Holiday(LocalDate holiday, String description, String dayOfWeek) {
            this.holiday = holiday;
            this.description = description;
            this.dayOfWeek = dayOfWeek;
        }
        @Override
        public String toString() {
            return this.description + "    " + holiday.getDayOfMonth() + "  :  " + holiday.getMonth() + " :  " + holiday.getYear() + "  :  " + holiday.getDayOfWeek();
        }
    }

    public void addAllHoliday() {
        for (LocalDate day : listOfDays) {
            if (day.getDayOfWeek() == DayOfWeek.SATURDAY || day.getDayOfWeek() == DayOfWeek.SUNDAY) {
                addHoliday(new Holiday(day, "Holiday", day.getDayOfWeek().toString()));
            }
        }
    }

    public void addHoliday(Holiday holiday) {
        listOfHolidays.add(holiday);
    }

    public void showAllHollyDays() {
        for (Holiday day : listOfHolidays) {
            System.out.println(day);
        }
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public ArrayList<LocalDate> getListOfDays() {
        return listOfDays;
    }

    public void setListOfDays(ArrayList<LocalDate> listOfDays) {
        this.listOfDays = listOfDays;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}