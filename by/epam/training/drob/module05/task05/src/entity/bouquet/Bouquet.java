package entity.bouquet;

import entity.flower.Flower;
import entity.wrapper.Wrap;

import java.util.List;

public class Bouquet {
    private List<Flower> listOfFlower;
    private Wrap typeOfWrap;
    private double price;

    public Bouquet(List<Flower> listOfFlower, Wrap typeOfWrap) {
        this.listOfFlower = listOfFlower;
        this.typeOfWrap = typeOfWrap;
        this.price = setPrice();
    }

    public double setPrice() {
        double price = 0;
        for (Flower flower : this.listOfFlower) {
            price += flower.getPrice();
        }
        price += this.typeOfWrap.getPrice();
        return price;
    }

    public void setTypeOfWrap(Wrap typeOfWrap) {
        this.typeOfWrap = typeOfWrap;
    }

    @Override
    public String toString() {
        return "Bouquet" + "\n" +
                "listOfFlower  =  " + listOfFlower + "\n" +
                "typeOfWrap  =  " + typeOfWrap + "\n" +
                "total price  =  " + price;
    }
}
