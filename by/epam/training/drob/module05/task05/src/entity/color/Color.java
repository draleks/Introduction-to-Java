package entity.color;

public enum Color {

    RED("Red"),
    BLUE("Blue"),
    WHITE("White"),
    GOLD("Gold"),
    PINK("Pink"),
    YELLOW("Yellow"),
    GREEN("Green"),
    ORANGE("Orange");
    String name;

    Color(String name) {
        this.name = name;
    }
}
