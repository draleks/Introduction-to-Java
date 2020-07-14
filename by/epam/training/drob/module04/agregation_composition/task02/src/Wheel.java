import java.util.Objects;

public class Wheel {
    private String name;
    private boolean isRotation = false;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getRotation() {
        return isRotation;
    }

    public void setRotation(boolean rotation) {
        isRotation = rotation;
    }


}
