/* Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль. */

public class Task09 {
    public static void main(String[] args) {
        Book book = new Book(1,"White Castle","Beliaev","Minsk",1992,223,12,"hard cover");
        View view = new View();
        view.viewBook(book);
    }
}
