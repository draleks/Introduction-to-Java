package entity.flower;

import entity.color.Color;

import java.util.Objects;

public class Violet extends Flower {
    private String type;

    public Violet( int price, Color color, String type) {
        super(price, color);
        this.type = type;
        super.setNameFlower(TypeFlower.TULIP.name);
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Violet violet = (Violet) o;
        return Objects.equals(type, violet.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return super.toString() + "   type:  " + getType();
    }
}
