/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/

public class Main {
    public static void main(String[] args) {
        StudentLogic studentLogic = new StudentLogic();
        Student[] listOfStudents = new Student[10];
        listOfStudents[0] = new Student("Ivan", 11, new int[]{9, 10, 9});          //+
        listOfStudents[1] = new Student("Nicola", 11, new int[]{6, 10, 8});
        listOfStudents[2] = new Student("Petr", 12, new int[]{9, 10, 5});
        listOfStudents[3] = new Student("Stepan", 11, new int[]{9, 9, 7});
        listOfStudents[4] = new Student("Alex", 12, new int[]{2, 10, 9});
        listOfStudents[5] = new Student("Bob", 11, new int[]{3, 10, 9});
        listOfStudents[6] = new Student("Frank", 17, new int[]{4, 10, 9});
        listOfStudents[7] = new Student("Lyka", 11, new int[]{9, 10, 9});         //+
        listOfStudents[8] = new Student("Franc", 16, new int[]{7, 10, 9});
        listOfStudents[9] = new Student("Ivan", 14, new int[]{9, 10, 9});         //+

        for (Student student : listOfStudents
        ) {
            studentLogic.findGoodAcademicPerformance(student);
        }

    }
}
