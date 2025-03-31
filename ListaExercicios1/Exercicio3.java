package ListaExercicios1;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio3 {

   public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> paresList = new ArrayList<Integer>();
        ArrayList<Integer> imparesList = new ArrayList<Integer>();
        // nums.add("Teste"); // erro
        Random rnd = new Random();            
        for (int index = 0; index < 10; index++) {
            numeros.add(rnd.nextInt(1000));
        }
            System.out.println(numeros);
            
        int impares = 0;
        int pares = 0;
        
        for (int i = 0; i < numeros.size(); i++) {

        if (numeros.get(i)%2 == 0){
            paresList.add(numeros.get(i));
            pares ++;
        }
        else {
            imparesList.add(numeros.get(i));
            impares ++;

        }
        }
            System.out.println("Numeros Pares: " +paresList  + "quantidade: " + pares);
            System.out.println("Numeros Pares: " +imparesList  + "quantidade: "  + impares);
         }

        }
