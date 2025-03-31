package ListaExercicios1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio6 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int index = 0; index < 10; index++) {
            numeros.add(rnd.nextInt(8));
        }

        System.out.println("Números gerados: " + numeros);

        removerDuplicados(numeros);

        System.out.println("Números sem duplicatas: " + numeros);
    }

    public static void removerDuplicados(ArrayList<Integer> arr) {

        Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
    }
}
