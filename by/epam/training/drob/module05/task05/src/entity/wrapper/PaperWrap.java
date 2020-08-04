package entity.wrapper;

public class PaperWrap extends Wrap {
    private int density;

    public PaperWrap( String color, int price, int density) {
        super(TypeWrap.PAPER.type, color, price);
        this.density = density;
    }

    public int getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return super.toString() + "density = " + density;
    }
}
