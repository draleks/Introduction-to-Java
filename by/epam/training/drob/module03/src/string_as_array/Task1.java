package string_as_array;
/* Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.*/
public class Task1 {
    private static String[] changeArray(String[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.setLength(0);
            for (int j = 0; j < array[i].length(); j++) {
                char ch = array[i].charAt(j);
                if (Character.isLowerCase(ch)) {
                    result.append(ch);
                } else {
                    result.append('_').append(Character.toLowerCase(ch));
                }

            }
            array[i] = result.toString();

        }
        return array;
    }

    public static void main(String[] args) {
        String[] array = {"firstCount", "secondCount", "thirdCount", "fourthCount"};
        for (String a : changeArray(array)) {
            System.out.println(a);

        }
    }
}
