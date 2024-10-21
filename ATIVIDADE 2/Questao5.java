/* 
NOME COMPLETO: Cauã Matheus Barbosa Guimarães
DISCIPLINA: Desenvolvimento De Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Random;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        // Gera um número aleatório entre 1 e 100
        Random random = new Random();
        int numeroEscolhido = random.nextInt(100) + 1; // Gera número entre 1 e 100
        Scanner scanner = new Scanner(System.in);
        int tentativa = 0;

        System.out.println("Tente adivinhar o número escolhido (entre 1 e 100):");

        // Laço de repetição para as tentativas do usuário
        while (true) {
            System.out.print("Digite um número: ");
            tentativa = scanner.nextInt();

            if (tentativa < numeroEscolhido) {
                System.out.println("MAIOR");
            } else if (tentativa > numeroEscolhido) {
                System.out.println("MENOR");
            } else {
                System.out.println("ACERTOU!");
                break; // Encerra o laço quando o usuário acerta
            }
        }

        scanner.close();
    }
}
