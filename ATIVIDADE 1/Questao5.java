/* 
NOME COMPLETO: Cauã Matheus Barbosa Guimarães
DISCIPLINA: Desenvolvimento De Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a nota do usuário
        System.out.print("Informe uma nota de 0 a 100: ");
        double nota = scanner.nextDouble();

        // Valida a nota
        while (nota < 0 || nota > 100) {
            System.out.print("Nota inválida! Informe uma nota de 0 a 100: ");
            nota = scanner.nextDouble();
        }

        // Determina o conceito
        String conceito;
        if (nota > 90) {
            conceito = "A";
        } else if (nota > 80) {
            conceito = "B";
        } else if (nota > 70) {
            conceito = "C";
        } else if (nota > 60) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        // Exibe o resultado
        System.out.println("O conceito é: " + conceito);

        scanner.close();
    }
}
