package regex_pattern_macher;

public class Task2 {


    /*2. Дана строка, содержащая текст (xml-документ):
       Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа
   и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми
   парсерами XML для решения данной задачи нельзя.
    */

        public static void main(String[] args) {

            String xmlStr = "<notes>\n" +
                    "        <note id = \"1\">\n" +
                    "            <to>Вася</to>\n" +
                    "            <from>Света</from>\n" +
                    "            <heading>Напоминание</heading>\n" +
                    "            <body>Позвони мне завтра!</body>\n" +
                    "        </note>\n" +
                    "        <note id = \"2\">\n" +
                    "            <to>Петя</to>\n" +
                    "            <from>Маша</from>\n" +
                    "            <heading>Важное напоминание</heading>\n" +
                    "            <body/>\n" +
                    "        </note>\n" +
                    "     </notes>";

            parseXML(xmlStr, "to/from/heading/body");


        }

        public static void parseXML(String xmlStr, String elementsLine) {

            String[] elementsArray = elementsLine.split("/");
            String[] notes = xmlStr.split("</note>");

            for (String note : notes) {
                for (String element : elementsArray) {

                    String openTag = "<" + element + ">";
                    int start = note.indexOf(openTag);
                    if (start < 0){
                        continue;
                    }
                    start += openTag.length();

                    String closeTag = "</" + element + ">";
                    int end = note.lastIndexOf(closeTag);
                    if (end < 0){
                        continue;
                    }

                    String tag = note.substring(start, end);
                    System.out.println(element + ": " + tag);
                }

                System.out.println(" ");
            }
        }

    }

