import entity.bouquet.Bouquet;
import entity.flower.Flower;
import entity.flower.Rose;
import entity.flower.Tulip;
import entity.wrapper.PaperWrap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Flower> list = new ArrayList<>();
        list.add(new Rose());
        list.add(new Rose());
        list.add(new Tulip());
        Bouquet bouquet = new Bouquet(list,new PaperWrap());
        System.out.println(bouquet);

    }
}
