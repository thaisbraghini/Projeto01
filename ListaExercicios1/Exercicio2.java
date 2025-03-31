package ListaExercicios1;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio2 {

   public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        // nums.add("Teste"); // erro
        Random rnd = new Random();            
        for (int index = 0; index < 5; index++) {
            numeros.add(rnd.nextInt(1000));
        }
            System.out.println(numeros);
            
        int calcularmedia = 0;
        for (int i = 0; i < numeros.size(); i++) {
           calcularmedia += numeros.get(i)/numeros.size();
        }
        System.out.println("Media: " + calcularmedia);  
        }
   }    
