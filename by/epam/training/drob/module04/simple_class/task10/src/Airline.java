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

public class Airline {

    private String destination;
    private String flight;
    private String plane;
    private LocalTime departure;
    private DayOfWeek dayOfWeek;

    public Airline(String destination, String flight, String plane, LocalTime departure, DayOfWeek dayOfWeek) {
        this.destination = destination;
        this.flight = flight;
        this.plane = plane;
        this.departure = departure;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public LocalTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalTime departure) {
        this.departure = departure;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfTheWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return String.format("destination: %s\t flight: %s\t plane: %s\t departure: %s\t day of week: %s"
                , destination, flight, plane, departure, dayOfWeek);
    }
}
