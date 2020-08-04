import entity.bouquet.Bouquet;
import entity.color.Color;
import entity.flower.Flower;
import entity.flower.TypeFlower;
import entity.wrapper.PaperWrap;
import factory.FactoryFlowers;

import java.util.ArrayList;


/* Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
и упаковка.*/

public class Main {
    public static void main(String[] args) {
        FactoryFlowers factory = new FactoryFlowers();
        ArrayList<Flower> list = new ArrayList<>();

       list.add(factory.createFlower(TypeFlower.ROSE));
        list.add(factory.createFlower(TypeFlower.ROSE));
        list.add(factory.createFlower(TypeFlower.ROSE));
        list.add(factory.createFlower(TypeFlower.TULIP));
        list.add(factory.createFlower(TypeFlower.VIOLET));
        Bouquet bouquet = new Bouquet(list,new PaperWrap(Color.GOLD.name(),21,1));
        System.out.println(bouquet);

    }
}
