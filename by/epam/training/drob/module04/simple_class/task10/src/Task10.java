import java.time.LocalTime;

/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать
 * критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * а) список рейсов для заданного пункта назначения;
 * б) список рейсов для заданного дня недели;
 * в) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Task10 {
    public static void main(String[] args) {
AirPortLogic airPortLogic = new AirPortLogic();

        Airline[] airlines = {
                new Airline("Moscow", "RU 1234", "Airbus 319",
                        LocalTime.of(18, 30), DayOfWeek.MONDAY),
                new Airline("Minsk", "BY 2255", "Airbus 320",
                        LocalTime.of(22, 15), DayOfWeek.THURSDAY),
                new Airline("London", "GB 6354", "Boing 747",
                        LocalTime.of(12, 0), DayOfWeek.MONDAY),
                new Airline("Paris", "FR 9952", "Airbus 321",
                        LocalTime.of(21, 45), DayOfWeek.FRIDAY),
                new Airline("New-York", "US 7711", "Airbus 319",
                        LocalTime.of(18, 0), DayOfWeek.SATURDAY),
                new Airline("Moscow", "RU 4321", "Boing 740",
                        LocalTime.of(20, 25), DayOfWeek.MONDAY),
                new Airline("Minsk", "BY 6633", "Airbus 320",
                        LocalTime.of(9, 30), DayOfWeek.WEDNESDAY),
                new Airline("New-York", "US 7536", "Boing 747",
                        LocalTime.of(2, 30), DayOfWeek.MONDAY),
        };

        AirPort airPort = new AirPort("Minsk - 1", airlines);

        airPort.printAirlines();

        System.out.println();

        airPortLogic.getAirlinesByDestination("Moscow",airPort);

        System.out.println("--------------------------------------");

        airPortLogic.getAirlinesByDayOfWeek(DayOfWeek.MONDAY,airPort);

        System.out.println("---------------------------------------");

        airPortLogic.getAirlinesByDayTime(DayOfWeek.MONDAY, LocalTime.of(12, 0),airPort);
    }
}
