import java.util.ArrayList;
import java.util.Comparator;

public class Administrator {
    public Account searchAccount(Client client, int numberAccount) {
        Account newAccount = new Account(1);
        for (Account account : client.getListOfAccounts()) {
            if (account.getNumberAccount() == numberAccount) {
                newAccount = account;
            }
        }
        return newAccount;
    }

    public void blockAccount(Client client, int numberAccount) {
        this.searchAccount(client, numberAccount).setAvailable(false);
    }

    public void unblockAccount(Client client, int numberAccount) {
        this.searchAccount(client, numberAccount).setAvailable(true);
    }

    public void viewAccount(Account account) {
        System.out.println(account);
    }

    public void viewGroupAccounts(Client client) {
        for (Account account : client.getListOfAccounts()) {
            this.viewAccount(account);
        }
    }

    public ArrayList<Account> sortByNumberAccount(Client client) {
        Comparator<Account> comparator = (o1, o2) -> o1.getNumberAccount() - o2.getNumberAccount();
        client.getListOfAccounts().sort(comparator);
        return client.getListOfAccounts();
    }

    public void amountAllAccounts(Client client) {
        long sum = 0;
        for (Account account : client.getListOfAccounts()) {
            sum += account.amountAccount;
        }
        System.out.println("Total amount all accounts " + sum);
    }

    public void amountPositiveAccounts(Client client) {
        long sum = 0;
        for (Account account : client.getListOfAccounts()) {
            if (account.getAmountAccount() > 0) {
                sum += account.amountAccount;
            }
        }
        System.out.println("Total amount positive accounts" + sum);
    }

    public void amountNegativeAccounts(Client client) {
        long sum = 0;
        for (Account account : client.getListOfAccounts()) {
            if (account.getAmountAccount() < 0) {
                sum += account.amountAccount;
            }
        }
        System.out.println("Total amount negative accounts" + sum);
    }
}