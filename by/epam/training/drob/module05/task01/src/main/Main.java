package main;
/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

import entity.Directory;
import entity.TextFile;
import logic.TextFileLogic;

public class Main {
    public static void main(String[] args) {
        TextFile textFile = new TextFile("NameTextFile",new Directory("g:/myFiles/new"),"Some text.");
        TextFileLogic logic = new TextFileLogic();
        logic.viewContent(textFile);
        logic.addContent(" Add some string.",textFile);
        logic.viewContent(textFile);
    }
}
