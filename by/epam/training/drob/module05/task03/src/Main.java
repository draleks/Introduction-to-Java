import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /*LocalDate day;
        ArrayList<LocalDate> listOfDays = new ArrayList<>();
       int year =2020;
        int LastDayOfYear = LocalDate.of(2020,12,31).getDayOfYear();
       for (int i=1;i<=LastDayOfYear;i++){
          listOfDays.add(LocalDate.ofYearDay(year,i));
       }
        for (LocalDate day2:listOfDays
             ) {
            System.out.println(day2+" "+day2.getDayOfWeek());
        }*/
        Calendar calendar = new Calendar(2020);
        calendar.createListOfDays();
       // calendar.showAllDays();
        System.out.println("____________________________________________");
        calendar.addAllHoliday();
        calendar.showAllHollyDays();

    }
}
