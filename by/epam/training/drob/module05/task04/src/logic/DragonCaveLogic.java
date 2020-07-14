package logic;
import entity.DragonCave;
import entity.Treasure;

import java.util.ArrayList;
import java.util.Arrays;

public class DragonCaveLogic {
    public void addTreasure(DragonCave dragonCave){
        dragonCave.getListOfTreasure().addAll(Arrays.asList(Treasure.values()));
            }
    public Treasure searchExpensiveTreasure(DragonCave cave){
        Treasure max = cave.getListOfTreasure().get(0);
        for (Treasure element:cave.getListOfTreasure()) {
            if (element.getCost()>max.getCost()){
                max = element;
            }
        }
        return max;
    }
    public ArrayList<Treasure> buySomeTreasure(int sum,DragonCave cave){
        ArrayList<Treasure> newList = new ArrayList<>();
        while (sum>0){
            for (Treasure element:cave.getListOfTreasure()) {
                if(sum>=element.getCost()){
                    newList.add(element);
                    sum-=element.getCost();
                }
            }
        }
        return newList;
    }

}
