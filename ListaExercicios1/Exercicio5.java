package ListaExercicios1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int index = 0; index < 10; index++) {
            numeros.add(rnd.nextInt(1000));
        }

        System.out.println("Números gerados: " + numeros);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se ele está no array: ");
        int busca = scanner.nextInt();

        int posicao = numeros.indexOf(busca);  
        
        if (posicao != -1) {
            System.out.println("O número " + busca + " está presente na posição " + posicao );
        } else {
            System.out.println("O número " + busca + " não está presente.");
        }

    }
}
