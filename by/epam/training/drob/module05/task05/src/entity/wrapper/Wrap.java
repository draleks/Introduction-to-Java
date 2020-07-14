package entity.wrapper;

public abstract class Wrap {
    private String type;
    private String color;
    private double price;

    public Wrap(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return type +
                " color= " + color +
                " price= " + price;
    }
}
