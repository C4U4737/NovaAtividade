/* 
NOME COMPLETO: Cauã Matheus Barbosa Guimarães
DISCIPLINA: Desenvolvimento De Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de elementos da série de Fibonacci
        System.out.print("Informe a quantidade de elementos da série de Fibonacci: ");
        int n = scanner.nextInt();

        // Valida a entrada
        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            System.out.println("Série de Fibonacci:");

            // Variáveis para armazenar os dois primeiros elementos
            int a = 0, b = 1;

            // Imprime a série de Fibonacci
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int proximo = a + b; // Próximo número na série
                a = b; // Atualiza a para o próximo número
                b = proximo; // Atualiza b para o próximo número
            }
        }

        scanner.close();
    }
}
