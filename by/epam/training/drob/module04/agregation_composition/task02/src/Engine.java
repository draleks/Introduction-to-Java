import java.util.Objects;

public class Engine {
    private String model;
    private int enginePower;
    private boolean isStart;

    public Engine(String model, int enginePower) {
        this.model = model;
        this.enginePower = enginePower;
        isStart =false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public boolean getIsStart() {
        return isStart;
    }

    public void setIsStart(boolean start) {
        isStart = start;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return enginePower == engine.enginePower &&
                Objects.equals(model, engine.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, enginePower);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
}
