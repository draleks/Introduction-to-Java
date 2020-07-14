import java.util.Objects;

public class District {
    private String name;
    private Town mainTown;
    private int area;

    public District(String name, Town mainTown, int area) {
        this.name = name;
        this.mainTown = mainTown;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Town getMainTown() {
        return mainTown;
    }

    public void setMainTown(Town mainTown) {
        this.mainTown = mainTown;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return area == district.area &&
                Objects.equals(name, district.name) &&
                Objects.equals(mainTown, district.mainTown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mainTown, area);
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", mainTown=" + mainTown +
                ", area=" + area +
                '}';
    }
}
