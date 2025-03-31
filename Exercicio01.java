import javax.swing.JOptionPane;
import java.util.Arrays;

public class Exercicio01 {

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
        
        //crie um programa que receba um array (vetor) de N numeros inteiros e calcule a soma de todos os elementos 

        int total_numeros = 0;
        //entrada de dados usando JOptionPane
        String totalNumerosStr = JOptionPane.showInputDialog("Tamanho do vetor");
        // converte altera de String para int
        total_numeros = Integer.parseInt(totalNumerosStr);
        //criar vetor 
        int [] numeros = new int[total_numeros];
        imprimir(numeros);
        //preencher vetor

        for (int i = 0; i < numeros.length; i++){
            String aux = JOptionPane.showInputDialog("Digite");
            numeros[i] = Integer.valueOf(aux);
        }
        String s = imprimir(numeros);
        //somar todos os numeros
        int soma = 0;
        for (int i = 0; i < numeros.length; i++){
            soma += numeros[i];

        }
        JOptionPane.showMessageDialog(null, "Vetor: " + s + "\nSoma: " + soma);


    }
}
