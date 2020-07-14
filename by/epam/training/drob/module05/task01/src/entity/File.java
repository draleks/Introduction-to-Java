package entity;
/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/
import java.util.Objects;

public abstract class File {
    private String name;
    private int size;
    private Directory directory;
    private boolean isReadAble;
    private boolean isWriteAble;

    public File(String name, Directory directory) {
        this.name = name;
        this.size = 0;
        this.directory = directory;
        this.isReadAble = true;
        this.isWriteAble = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public boolean isReadAble() {
        return isReadAble;
    }

    public void setReadAble(boolean readAble) {
        isReadAble = readAble;
    }

    public boolean isWriteAble() {
        return isWriteAble;
    }

    public void setWriteAble(boolean writeAble) {
        isWriteAble = writeAble;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return size == file.size &&
                isReadAble == file.isReadAble &&
                isWriteAble == file.isWriteAble &&
                Objects.equals(name, file.name) &&
                Objects.equals(directory, file.directory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, directory, isReadAble, isWriteAble);
    }


}
