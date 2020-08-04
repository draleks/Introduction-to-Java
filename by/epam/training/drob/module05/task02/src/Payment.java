import java.util.ArrayList;

/*Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.*/
public class Payment {
    private int id;
    private Client client;
    private Check check;

    public Payment(int id, Client client) {
        this.id = id;
        this.client = client;
    }

    public class Check {
        ArrayList<Product> products;

        public ArrayList<Product> getProducts() {
            return products;
        }

        public void setProducts(ArrayList<Product> products) {
            this.products = products;
        }

        private void addProduct(Product product) {
            this.products.add(product);
        }

        private void removeProduct(Product product) {
            this.products.remove(product);
        }

        public double getTotalPrise(Check check) {
            double sum = 0;
            for (Product product : check.products) {
                sum += product.getPrice();
            }
            return sum;
        }
    }

    public void obtainCheck(ArrayList<Product> products) {
        check = new Check();
        check.setProducts(products);

    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Check getCheck() {
        return check;
    }

    public void setCheck(Check check) {
        this.check = check;
    }
}
