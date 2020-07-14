package sorting_algoritm;

/*Даны две последовательности
{a1,  a2, ..., an} и {b1, b2,..., bm}. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.*/

public class Task2 {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 7,8,9};
        int[] arrayB = {2, 4, 5, 6};
        int indA = 0;
        int indB = 0;
        int indNew = 0;
        int[] newArray = new int[arrayA.length + arrayB.length];
        for (int i = 0; i < newArray.length; i++) {
            if ((indA < arrayA.length) && (indB < arrayB.length)) {
                if (arrayA[indA] <= arrayB[indB]) {
                    newArray[i] = arrayA[indA];
                    indA++;
                    indNew++;
                } else {
                    newArray[i] = arrayB[indB];
                    indB++;
                    indNew++;
                }
            }

        }
        if (indA < arrayA.length) {
            for (int i = indNew; i < newArray.length; i++) {
                newArray[i] = arrayA[indA];
                indA++;
            }
        } else {
            for (int i = indNew; i < newArray.length; i++) {
                newArray[i] = arrayB[indB];
                indB++;
            }
        }
        for (int a : newArray) {
            System.out.print(a);
        }

    }
}
