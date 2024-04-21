import java.util.Scanner;
import java.util.InputMismatchException;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            double numerador = scanner.nextDouble();  // Lê o primeiro número

            System.out.print("Digite o denominador: ");
            double denominador = scanner.nextDouble();  // Lê o segundo número

            if (denominador == 0) {
                throw new ArithmeticException("Divisão por zero");
            }

            double resultado = numerador / denominador;  // Realiza a divisão
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite apenas números.");
        } finally {
            scanner.close();  // Fecha o scanner independente do resultado
        }
    }
}
