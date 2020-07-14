/* Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
        площади, периметра и точки пересечения медиан.*/

public class Task07 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        Logic logic = new Logic();
        System.out.println(logic.isExist(triangle));
        System.out.println(logic.perimeter(triangle));

        System.out.println("Second triangle");
        Triangle triangle2 = new Triangle(2,3,5);
        System.out.println(logic.isExist(triangle2));

    }
}
