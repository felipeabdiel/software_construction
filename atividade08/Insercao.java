import java.util.Scanner;
import java.util.InputMismatchException;

public class Insercao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int count = 0;

        System.out.println("Digite valores inteiros para preencher o vetor. Digite 0 para parar e exibir os valores.");

        while (true) {
            if (count >= numeros.length) {
                System.out.println("Limite do vetor alcançado. Não é possível inserir mais valores.");
                break;
            }
            try {
                System.out.print("Digite um número (0 para parar): ");
                int num = scanner.nextInt();

                numeros[count] = num;
                count++;

                if (num == 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite apenas números inteiros.");
                scanner.next(); // Limpa o buffer do scanner ignorando a entrada incorreta
            }
        }

        // Exibindo os dados coletados
        System.out.println("Elementos no vetor:");
        for (int i = 0; i < count; i++) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}
