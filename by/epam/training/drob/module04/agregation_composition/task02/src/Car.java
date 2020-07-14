import java.util.ArrayList;

public class Car {
    private String model;
    private Engine engine;
    private ArrayList<Wheel> listOfWheels;
    private int fuel;

    public Car(String model, Engine engine, ArrayList<Wheel> listOfWheels, int fuel) {
        this.model = model;
        this.engine = engine;
        this.listOfWheels = listOfWheels;
        this.fuel = fuel;
    }

    public ArrayList<Wheel> getListOfWheels() {
        return listOfWheels;
    }

    public void setListOfWheels(ArrayList<Wheel> listOfWheels) {
        this.listOfWheels = listOfWheels;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }
}
