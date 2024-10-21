/* 
NOME COMPLETO: Cauã Matheus Barbosa Guimarães
DISCIPLINA: Desenvolvimento De Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class VetorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. SAIR");
            System.out.print("Digite sua opção: ");
            int opcao = scanner.nextInt();

            // Verifica se o usuário deseja sair
            if (opcao == 5) {
                continuar = false;
                System.out.println("Saindo da calculadora. Até logo!");
                break;
            }

            // Solicita a entrada de dois números
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            double resultado = 0;

            // Realiza a operação escolhida
            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.printf("Resultado da adição: %.2f%n", resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.printf("Resultado da subtração: %.2f%n", resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.printf("Resultado da multiplicação: %.2f%n", resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.printf("Resultado da divisão: %.2f%n", resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
