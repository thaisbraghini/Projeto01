package ListaExercicios1;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio4 {

   public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Random rnd = new Random();            

        for (int index = 0; index < 10; index++) {
            numeros.add(rnd.nextInt(1000));
        }

        System.out.println("Números originais: " + numeros);

        inverterArray(numeros);

        System.out.println("Números invertidos: " + numeros);}

        public static void inverterArray(ArrayList<Integer> arr) {
            int n = arr.size();
            for (int i = 0; i < n / 2; i++) {
                int temp = arr.get(i);
                arr.set(i, arr.get(n - i - 1));
                arr.set(n - i - 1, temp);
            }
    }
}
