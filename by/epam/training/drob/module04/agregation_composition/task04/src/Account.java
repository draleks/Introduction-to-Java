import java.util.Objects;

public class Account {
    int numberAccount;
    int amountAccount;
    boolean isAvailable = true;

    public Account(int numberAccount, int amountAccount) {
        this.numberAccount = numberAccount;
        this.amountAccount = amountAccount;
            }

    public Account(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getAmountAccount() {
        return amountAccount;
    }

    public void setAmountAccount(int amountAccount) {
        this.amountAccount = amountAccount;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return numberAccount == account.numberAccount &&
                amountAccount == account.amountAccount &&
                isAvailable == account.isAvailable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberAccount, amountAccount, isAvailable);
    }

    @Override
    public String toString() {
        return "Account{" +
                "numberAccount=" + numberAccount +
                ", amountAccount=" + amountAccount +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
