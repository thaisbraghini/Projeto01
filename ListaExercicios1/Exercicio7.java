package ListaExercicios1;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio7 {
    public static void main(String[] args) {

        // Exemplo de array
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2; 


        System.out.println("Array original: " + numeros);

        rotacionarArray(numeros, k);

        System.out.println("Array após rotação: " + numeros);
    }

    public static void rotacionarArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();

        k = k % n;  

        ArrayList<Integer> parteFinal = new ArrayList<>(arr.subList(n - k, n));
        ArrayList<Integer> parteInicial = new ArrayList<>(arr.subList(0, n - k));

        arr.clear();
        arr.addAll(parteFinal);
        arr.addAll(parteInicial);
    }
}
