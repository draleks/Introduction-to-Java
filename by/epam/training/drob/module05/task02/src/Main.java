import java.util.ArrayList;

/*Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> listOfProduct = new ArrayList<>();
        Client client = new Client("Ivan", "Sidorov");
        listOfProduct.add(new Product("clock", "small,green", 21));
        listOfProduct.add(new Product("hat", "size: 26", 32));
        listOfProduct.add(new Product("shoes", "size: 42", 44));
        listOfProduct.add(new Product("shirt", "size: 50, blue", 44));
        Product product5 = new Product("jacket", "size: 50", 200);
        Payment payment = new Payment(1,client);
        payment.obtainCheck(listOfProduct);
        payment.getCheck().products.add(product5);

    }
}
