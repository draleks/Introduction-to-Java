package entity;

public enum Treasure {
    ETHEREUM("gold coin", 100),
    RIPPLE("gold coin", 120),
    LITECOIN("gold coin", 120),
    TETHER("silver coin", 30),
    BITCOIN("bronze coin", 10),
    LIBRA("bronze coin", 10),
    MONERO("bronze coin", 10),
    EOS("bronze coin", 10),
    REAL("spanish bronze coin", 70),
    DOUBLOON("gold coin", 200),
    RUBLE("bronze coin", 30),
    PENNY("bronze coin", 60),
    ESCUDO("gold coin", 20),
    ALEXANDRITE("gem", 40),
    AMBER("yellow gem", 30),
    JADE("green gem", 5),
    OPAL("gem", 40),
    RUBY("red gem", 100),
    SUPPHIRE("gem", 50),
    TOPAZ("gem", 30),
    PEARL("gem", 150),
    IOLITE("gem", 120),
    GARNET("red gem", 100);
    String description;
    int cost;

    Treasure(String description, int cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.name() + "    " + description + " cost     =   " + cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
