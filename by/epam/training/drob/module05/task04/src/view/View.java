package view;

import entity.DragonCave;
import entity.Treasure;

import java.util.ArrayList;

public class View {
    public void viewAllTreasure(ArrayList<Treasure> list) {
        for (Treasure element : list) {
            System.out.println(element);
        }
    }

    public void viewTreasure(Treasure element) {
        System.out.println(element);
    }
}
