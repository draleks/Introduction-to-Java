import java.util.ArrayList;
import java.util.Objects;

public class Country {
    String name;
    Town capital;
    int area;
    ArrayList<Region> listOfRegions;

    public Country(String name, Town capital, int area, ArrayList<Region> listOfRegions) {
        this.name = name;
        this.capital = capital;
        this.area = area;
        this.listOfRegions = listOfRegions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Town getCapital() {
        return capital;
    }

    public void setCapital(Town capital) {
        this.capital = capital;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public ArrayList<Region> getListOfRegions() {
        return listOfRegions;
    }

    public void setListOfRegions(ArrayList<Region> listOfRegions) {
        this.listOfRegions = listOfRegions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return area == country.area &&
                Objects.equals(name, country.name) &&
                Objects.equals(capital, country.capital) &&
                Objects.equals(listOfRegions, country.listOfRegions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, area, listOfRegions);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital=" + capital +
                ", area=" + area +
                       '}';
    }
}
