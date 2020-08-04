import entity.Account;
import entity.Client;
import logic.BankLogic;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
/* Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

public class Task04 {
    public static void main(String[] args) {
        ArrayList<Account> listOfAccounts = new ArrayList<>();
        listOfAccounts.add(new Account(11,100));
        listOfAccounts.add(new Account(12,200));
        listOfAccounts.add(new Account(13,-100));
        listOfAccounts.add(new Account(14,-130));

        Client client = new Client("Jack",listOfAccounts);
        BankLogic administrator = new BankLogic();
        administrator.amountAllAccounts(client);
        administrator.amountNegativeAccounts(client);
        administrator.amountPositiveAccounts(client);
    }
    
}
