import java.util.ArrayList;
import java.util.Objects;

public class Region {
    private String name;
    private int area;
    private ArrayList<District> listOfDistricts;

    public Region(String name, int area, ArrayList<District> listOfDistricts) {
        this.name = name;
        this.area = area;
        this.listOfDistricts = listOfDistricts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<District> getListOfDistricts() {
        return listOfDistricts;
    }

    public void setListOfDistricts(ArrayList<District> listOfDistricts) {
        this.listOfDistricts = listOfDistricts;
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
        Region region = (Region) o;
        return area == region.area &&
                Objects.equals(name, region.name) &&
                Objects.equals(listOfDistricts, region.listOfDistricts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, area, listOfDistricts);
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
