package ListaExercicios1;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio8 {
    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        int[] resultado = mergeArrays(array1, array2);

        System.out.println("Array mesclado: " + Arrays.toString(resultado));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] resultado = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                resultado[k++] = arr1[i++];
            } else {
                resultado[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            resultado[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            resultado[k++] = arr2[j++];
        }

        return resultado;
    }
}
