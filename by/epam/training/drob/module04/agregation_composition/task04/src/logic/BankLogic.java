package logic;

import entity.Account;
import entity.Client;

import java.util.ArrayList;
import java.util.Comparator;


public class BankLogic {

    public Account searchAccount(Client client, int numberAccount) {
        Account newAccount = new Account(0);//Создаем новый аккаунт, на случай если аккаунт который мы ищем не существыет.
        for (Account account : client.getListOfAccounts()) {
            if (account.getNumberAccount() == numberAccount) {
                newAccount = account;
            } else {
                System.out.println("Аккаунт не найден");
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

    public ArrayList<Account> sortByNumberAccount(Client client) {
        Comparator<Account> comparator = (o1, o2) -> o1.getNumberAccount() - o2.getNumberAccount();
        client.getListOfAccounts().sort(comparator);
        return client.getListOfAccounts();
    }

    public long amountAllAccounts(Client client) {
        long sum = 0;
        for (Account account : client.getListOfAccounts()) {
            sum += account.getAmountAccount();
        }
        return sum;
    }

    public long amountPositiveAccounts(Client client) {
        long sum = 0;
        for (Account account : client.getListOfAccounts()) {
            if (account.getAmountAccount() > 0) {
                sum += account.getAmountAccount();
            }
        }
        return sum;
    }

    public long amountNegativeAccounts(Client client) {
        long sum = 0;
        for (Account account : client.getListOfAccounts()) {
            if (account.getAmountAccount() < 0) {
                sum += account.getAmountAccount();
            }
        }
        return sum;
    }
}