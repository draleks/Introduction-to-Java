package entity.wrapper;

public class RibbonWrap extends Wrap {
    private int length;

    public RibbonWrap( String color, int price, int length) {
        super(TypeWrap.RIBBON.type, color, price);
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString() + "length ribbon =  " + length;
    }
}
