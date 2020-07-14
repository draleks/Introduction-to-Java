import java.util.Objects;

/*Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.*/
public class Product {
    private static int genId = 1;
    private int id;
    private String name;
    private String description;
    private double price;

    public Product(String name, String description, int price) {
        this.id = genId++;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price &&
                Objects.equals(name, product.name) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price);
    }

    @Override
    public String toString() {
        return String.format("Product: #%d\t %s\t, %s\t, %.2f", id, name, description, price);
    }
}
