package entity.wrapper;

public class MembraneWrap extends Wrap{
    private int density;

    public MembraneWrap(String type, String color, int price, int density) {
        super(TypeWrap.MEMBRANE.type, color, price);
        this.density = density;
    }

    @Override
    public String toString() {
        return super.toString()+"density = "+density;
    }
}
