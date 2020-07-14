import java.util.ArrayList;

public class Client {
    private String name;
    private ArrayList<Account> listOfAccounts;

    public Client(String name, ArrayList<Account> listOfAccounts) {
        this.name = name;
        this.listOfAccounts = listOfAccounts;
    }

    public String getName() {
        return name;
    }
     public ArrayList<Account> getListOfAccounts() {
        return listOfAccounts;
    }


}
