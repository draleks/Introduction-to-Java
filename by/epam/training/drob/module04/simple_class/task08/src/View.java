import java.util.List;

public class View{
    public void viewCustomer(Customer customer) {
        System.out.println(customer);
    }

    public void viewListCustomers(List<Customer> customers) {
        for (Customer customer : customers
        ) {
            System.out.println(customer);
        }
    }
}
