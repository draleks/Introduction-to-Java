package view;

import entity.Train;

import java.util.ArrayList;

public class View {
    public void showAll( ArrayList<Train> trains) {
        for (Train train : trains) {
            System.out.println(train);
        }
    }

    public void showTrain(Train train) {

        System.out.println(train);
    }

}