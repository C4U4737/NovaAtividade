/* 
NOME COMPLETO: Cauã Matheus Barbosa Guimarães
DISCIPLINA: Desenvolvimento De Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        
        // Solicita as notas dos alunos
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + " (0 a 10): ");
            notas[i] = scanner.nextDouble();
            // Valida a nota
            while (notas[i] < 0 || notas[i] > 10) {
                System.out.print("Nota inválida! Digite novamente (0 a 10): ");
                notas[i] = scanner.nextDouble();
            }
        }

        // Inicializa variáveis para calcular a maior e a menor nota
        double maiorNota = notas[0];
        double menorNota = notas[0];
        double soma = 0;

        // Calcula a maior, a menor nota e a soma das notas
        for (double nota : notas) {
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
            soma += nota;
        }

        // Calcula a média da turma
        double media = soma / notas.length;

        // Exibe os resultados
        System.out.printf("A maior nota é: %.2f%n", maiorNota);
        System.out.printf("A menor nota é: %.2f%n", menorNota);
        System.out.printf("A média da turma é: %.2f%n", media);

        scanner.close();
    }
}
