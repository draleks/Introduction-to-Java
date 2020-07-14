import java.time.LocalTime;

/**
 * 9. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать
 * критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * а) список рейсов для заданного пункта назначения;
 * б) список рейсов для заданного дня недели;
 * в) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class AirPort {

    private String name;
    private Airline[] airlines;

    public AirPort(String name, Airline[] airlines) {
        this.name = name;
        this.airlines = airlines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }







    public void printAirlines(){

        for (Airline airline : airlines){
            System.out.println(airline);
        }
    }
}