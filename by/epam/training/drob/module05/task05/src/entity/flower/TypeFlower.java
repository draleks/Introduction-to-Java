package entity.flower;

public enum TypeFlower {
   TULIP("Tulip"),
    ROSE("Rose"),
    VIOLET("Violet");
    String name;

    TypeFlower(String name) {
        this.name = name;
    }
}
