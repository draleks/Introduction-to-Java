package View;

import entity.Account;
import entity.Client;

public class View {
    public void viewAccount(Account account) {
        System.out.println(account);
    }

    public void viewGroupAccounts(Client client) {
        for (Account account : client.getListOfAccounts()) {
            this.viewAccount(account);
        }
    }
}
