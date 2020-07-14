package entity;

import java.util.ArrayList;

public class Depo {
    private ArrayList<Train> trains = new ArrayList<>();

    public Depo(ArrayList<Train> trains) {

        this.trains = trains;
    }

    public ArrayList<Train> getTrains() {
        return this.trains;
    }

    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }
}
