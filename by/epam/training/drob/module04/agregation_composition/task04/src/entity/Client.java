package entity;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Objects.equals(listOfAccounts, client.listOfAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, listOfAccounts);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Account account : this.getListOfAccounts()) {
            builder.append(account.toString());
            builder.append("\n");
        }
        return getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", listOfAccounts:" + builder.toString();

    }
}

