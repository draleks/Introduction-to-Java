package entity;

public enum DayOfWeek {
    MONDAY("Monday"),
    TUESDAY(" Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sanday");

    String name;

    DayOfWeek(String name) {
        this.name = name;
    }
}
