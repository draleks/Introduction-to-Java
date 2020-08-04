package entity.flower;

import entity.color.Color;

import java.util.Objects;

public class Rose extends Flower {
    private int lengthFlower;

    public Rose(int price, Color color, int lengthFlower) {
        super(price, color);
        this.lengthFlower = lengthFlower;
        super.setNameFlower(TypeFlower.ROSE.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rose rose = (Rose) o;
        return lengthFlower == rose.lengthFlower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lengthFlower);
    }

    public int getLengthFlower() {
        return lengthFlower;
    }

    @Override
    public String toString() {
        return super.toString() + "    lengthFlower:  " + getLengthFlower()+'}';
    }
}
