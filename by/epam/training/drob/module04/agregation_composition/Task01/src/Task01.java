/* Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
*/
public class Task01 {
    public static void main(String[] args) {
        Text text =new Text(new Word("Title"),new Phrase("This is a simple text."));
        text.viewText();
        text.addText(new Phrase("We add some words."));
        text.viewText();
    }
}
