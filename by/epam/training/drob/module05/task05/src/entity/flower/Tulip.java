package entity.flower;

import entity.color.Color;

public class Tulip extends Flower{
    private String producer;

    public Tulip( int price, Color color, String producer) {
        super( price, color);
        this.producer = producer;
        super.setNameFlower(TypeFlower.TULIP.name);
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return super.toString()+ "   producer:  " + getProducer();
    }
}
