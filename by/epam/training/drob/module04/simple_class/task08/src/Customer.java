import java.util.Objects;

public class Customer {
    private int id;
    private String lastName;
    private String name;
    private String address;
    private int creditCard;
    private int bankAccount;

    public Customer(int id, String lastName, String name, String address, int creditCard, int bankAccount) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                creditCard == customer.creditCard &&
                bankAccount == customer.bankAccount &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, name, address, creditCard, bankAccount);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", creditCard=" + creditCard +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
