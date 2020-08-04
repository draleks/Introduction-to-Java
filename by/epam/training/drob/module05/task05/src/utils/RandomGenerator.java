package utils;

import entity.color.Color;

import java.util.Random;

public class RandomGenerator {
    Random random = new Random();

    public int generatePrice() {
        return random.nextInt(23)+1;
    }

    public Color GenerateColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }
    public int generateLengthFlower(){
        return random.nextInt(10)+10;
    }
    public String generateProducer(){
        if (random.nextInt(100)%2==0){
            return "DorOrs";
        }
        else {
            return "Komunarka";
        }
    }
    public String generateType(){
        if (random.nextInt(100)%2==0){
            return "First";
        }
        else {
            return "Second";
        }
    }
}
