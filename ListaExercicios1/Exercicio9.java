package ListaExercicios1;

public class Exercicio9 {

    public static void main(String[] args) {
        int[] numeros = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Array: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        int resultado = maxSubarraySum(numeros);
        System.out.println("\nMaior soma do subarray: " + resultado);
    }
    public static int maxSubarraySum(int[] arr) {

        int maxAtual = arr[0];  
        int maxGlobal = arr[0]; 

        for (int i = 1; i < arr.length; i++) {

            maxAtual = Math.max(arr[i], maxAtual + arr[i]);

            maxGlobal = Math.max(maxGlobal, maxAtual);
        }
        
        return maxGlobal; 
    }
}
