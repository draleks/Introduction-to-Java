package entity;

import java.util.ArrayList;

public class DragonCave {
    ArrayList<Treasure> listOfTreasure;

    public DragonCave() {
       listOfTreasure = new ArrayList<>();
    }

    public ArrayList<Treasure> getListOfTreasure() {
        return listOfTreasure;
    }

    public void setListOfTreasure(ArrayList<Treasure> listOfTreasure) {
        this.listOfTreasure = listOfTreasure;
    }
}
