import entity.Calendar;
import logic.CalendarLogic;
import view.ViewCalendar;
/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
выходных и праздничных днях.*/

public class Main {
    public static void main(String[] args) {

        Calendar myCalendar = new Calendar();
        Calendar.Day newDay = myCalendar.new Day(2020, 05, 9);
        CalendarLogic calendarLogic = new CalendarLogic();
        calendarLogic.CheckIsHoliday(newDay);
        ViewCalendar viewCalendar = new ViewCalendar();
        viewCalendar.viewDay(myCalendar, newDay);
    }
}
