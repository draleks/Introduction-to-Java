package entity.flower;

public abstract class Flower {
    private  String name;
    private  double price;
    private String color;

    public Flower(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " +"price  =   " + price + " color  = " + color ;
    }
}
