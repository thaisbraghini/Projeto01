package ListaExercicios1;

import javax.swing.JOptionPane;

public class Exercicio1 {


    public static String imprimir( int []v) {
        String saida = " [ " ; 
        for (int i = 0; i < v.length; i++){
            saida = saida + v[i] + " ";
        }
        saida += "]";
        JOptionPane.showMessageDialog(null, saida );
        return saida;
    }

    public static void main(String[] args) {

        int total_numeros = 0;

        String totalNumerosStr = JOptionPane.showInputDialog("Tamanho do vetor");

        total_numeros = Integer.parseInt(totalNumerosStr);

        int [] numeros = new int[total_numeros];
        imprimir(numeros);


        for (int i = 0; i < numeros.length; i++){
            String aux = JOptionPane.showInputDialog("Digite");
            numeros[i] = Integer.valueOf(aux);
        }
        String s = imprimir(numeros);

        int max = 0;
        for (int i = 0; i < numeros.length; i++){
            max = Math.max(max, numeros[i]);
        }
        JOptionPane.showMessageDialog(null, "Vetor: " + s + "\nMaior numero: " + max);
        int min = numeros[0];
        for (int i = 0; i < numeros.length; i++){
            min = Math.min(min, numeros[i]);
        }
        JOptionPane.showMessageDialog(null, "Vetor: " + s + "\nMenor numero: " + min);


    }
}

