import java.util.ArrayList;
import java.util.Comparator;


public class LogicCustomer {
    public ArrayList<Customer> sortByName(ArrayList<Customer> list) {
        Comparator<Customer> comparatorByName = new Comparator<>() {

            @Override
            public int compare(Customer o1, Customer o2) {
                int temp = o1.getLastName().compareTo(o2.getLastName());
                if (temp == 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return temp;

            }
        };
        list.sort(comparatorByName);
        return list;
    }

    public ArrayList<Customer> chooseByCreditCard(ArrayList<Customer> list, int from, int to) {
        ArrayList<Customer> sortedList = new ArrayList<>();
        for (Customer customer : list
        ) {
            if (customer.getCreditCard() >= from && customer.getCreditCard() <= to) {
                sortedList.add(customer);
            }
        }
        return sortedList;
    }
}
