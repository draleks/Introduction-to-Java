package factory;

import entity.color.Color;
import entity.flower.*;
import utils.RandomGenerator;

public class FactoryFlowers {
    public Flower createFlower(TypeFlower flower) {
        RandomGenerator gen = new RandomGenerator();
        switch (flower) {
            case ROSE:
                return new Rose(gen.generatePrice(), gen.GenerateColor(), gen.generateLengthFlower());
            case TULIP:
                return new Tulip(gen.generatePrice(), gen.GenerateColor(), gen.generateProducer());
            case VIOLET:
                return new Violet(gen.generatePrice(), gen.GenerateColor(), gen.generateType());
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + flower);

        }
    }
}
