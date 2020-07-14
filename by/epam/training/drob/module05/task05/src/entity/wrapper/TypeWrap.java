package entity.wrapper;

public enum TypeWrap {
    PAPER("Paper"),
    MEMBRANE("Membrane"),
    RIBBON("Ribbon");
    String type;

    TypeWrap(String type) {
        this.type = type;
    }
}
