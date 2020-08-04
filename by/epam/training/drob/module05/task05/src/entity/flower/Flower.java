package entity.flower;

import entity.color.Color;

import java.util.Objects;

public abstract class Flower {
    private String nameFlower;
    private int price;
    private Color color;

    public Flower(int price, Color color) {
        this.price = price;
        this.color = color;
    }

    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.price, price) == 0 &&
                Objects.equals(nameFlower, flower.nameFlower) &&
                color == flower.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFlower, price, color);
    }

    @Override
    public String toString() {
        return "{Flower" + nameFlower + '\'' +
                ", price=" + price +
                ", color=" + color;
    }
}
