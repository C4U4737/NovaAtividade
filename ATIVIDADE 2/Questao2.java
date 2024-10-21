/* 
NOME COMPLETO: Cauã Matheus Barbosa Guimarães
DISCIPLINA: Desenvolvimento De Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Cálculo da Regra de Três Simples");
            System.out.print("Digite o valor A (referência): ");
            double valorA = scanner.nextDouble();
            System.out.print("Digite o valor B (referência): ");
            double valorB = scanner.nextDouble();
            System.out.print("Digite o valor C (proporcional): ");
            double valorC = scanner.nextDouble();

            // Calcula o valor D usando a regra de três simples
            double valorD = (valorB * valorC) / valorA;

            // Exibe o resultado
            System.out.printf("Se %.2f está para %.2f, então %.2f está para %.2f.%n", valorA, valorB, valorC, valorD);

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja fazer outro cálculo? (Digite 's' para sim ou 'n' para sair): ");
            char resposta = scanner.next().charAt(0);
            if (resposta == 'n' || resposta == 'N') {
                continuar = false;
                System.out.println("Saindo do programa. Até logo!");
            }
        }

        scanner.close();
    }
}
