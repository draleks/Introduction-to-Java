import java.util.ArrayList;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
        и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
        и методами. Задать критерии выбора данных и вывести эти данные на консоль*/
public class Task08 {
    public static void main(String[] args) {
        ArrayList<Customer> listOfCustomers = new ArrayList<>();
        listOfCustomers.add(new Customer(1,"Ivanov","Ivan","Minsk",1221,1221_0000));
        listOfCustomers.add(new Customer(2,"Ivanov","Alex","Minsk",3221,3221_0000));
        listOfCustomers.add(new Customer(3,"Bobov","Jeck","Moskow",4221,4221_0000));
        listOfCustomers.add(new Customer(4,"Ivanov","Petr","Minsk",1991,1991_0000));
        listOfCustomers.add(new Customer(4,"Voitov","Stepan","Kiev",3993,3993_0000));
       CustomerBase customerBase =  new CustomerBase(listOfCustomers);
       LogicCustomer logicCustomer = new LogicCustomer();
       View view = new View();
       view.viewListCustomers(logicCustomer.sortByName(customerBase.getListOfCustomer()));
        System.out.println("--------------------------------");
        view.viewListCustomers(logicCustomer.chooseByCreditCard(customerBase.getListOfCustomer(),1000,2000));
    }
}
