/* 
NOME COMPLETO: Cauã Matheus Barbosa Guimarães
DISCIPLINA: Desenvolvimento De Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor cheio da compra
        System.out.print("Informe o valor cheio da compra: ");
        double valorCheio = scanner.nextDouble();

        // Solicita o valor do desconto
        System.out.print("Informe o valor do desconto: ");
        double valorDesconto = scanner.nextDouble();

        // Calcula o novo valor
        double novoValor = valorCheio - valorDesconto;

        // Exibe os resultados
        System.out.printf("O valor cheio é: %.2f%n", valorCheio);
        System.out.printf("O valor do desconto é: %.2f%n", valorDesconto);
        System.out.printf("O novo valor é: %.2f%n", novoValor);

        scanner.close();
    }
}
