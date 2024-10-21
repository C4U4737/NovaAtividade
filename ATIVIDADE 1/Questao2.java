/* 
NOME COMPLETO: Cauã Matheus Barbosa Guimarães
DISCIPLINA: Desenvolvimento De Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário digite um número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        // Verifica se o número é par ou ímpar
        String parOuImpar = (numero % 2 == 0) ? "par" : "ímpar";
        
        // Verifica se o número é positivo ou negativo
        String positivoOuNegativo = (numero >= 0) ? "positivo" : "negativo";
        
        // Verifica se o número é primo
        String primo = isPrimo((int) numero) ? "sim" : "não";

        // Calcula a raiz quadrada
        double raizQuadrada = Math.sqrt(numero);

        // Calcula o número elevado a 3
        double elevadoACinco = Math.pow(numero, 3);

        // Exibe os resultados
        System.out.println("O número é: " + parOuImpar);
        System.out.println("O número é: " + positivoOuNegativo);
        System.out.println("O número é primo: " + primo);
        System.out.println("A raiz quadrada do número é: " + raizQuadrada);
        System.out.println("O número elevado a 3 é: " + elevadoACinco);

        scanner.close();
    }

    // Método para verificar se um número é primo
    private static boolean isPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
