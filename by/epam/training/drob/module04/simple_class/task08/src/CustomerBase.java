import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerBase {
   private ArrayList<Customer> listOfCustomer;

    public CustomerBase(ArrayList<Customer> listOfCustomer) {
        this.listOfCustomer = listOfCustomer;
    }

    public ArrayList<Customer> getListOfCustomer() {
        return listOfCustomer;
    }

    public void setListOfCustomer(ArrayList<Customer> listOfCustomer) {
        this.listOfCustomer = listOfCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerBase that = (CustomerBase) o;
        return Objects.equals(listOfCustomer, that.listOfCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfCustomer);
    }

    @Override
    public String toString() {
        return "CustomerBase{" +
                "listOfCustomer=" + listOfCustomer +
                '}';
    }
    public void addCustomer(Customer customer){
        this.getListOfCustomer().add(customer);
    }
}
