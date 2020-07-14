package logic;
/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/
import entity.Directory;
import entity.TextFile;

public class TextFileLogic {
   public TextFile create(String name, Directory directory, String content){
       return new TextFile(name,directory,content);
   }
    public void renameFile(String name, TextFile textFile) {
        textFile.setName(name);
    }

    public void viewContent(TextFile textFile) {
        System.out.println(textFile.toString());
    }
    public  void addContent(String content,TextFile file){
      file.setContent(file.getContent()+content);
    }
    public void deleteFile(TextFile file){
       file = null;
    }

}
