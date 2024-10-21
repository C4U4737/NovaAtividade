/* 
NOME COMPLETO: Cauã Matheus Barbosa Guimarães
DISCIPLINA: Desenvolvimento De Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Solicita ao usuário que insira 10 números
        System.out.println("Insira 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Apresenta a lista com os números obtidos
        System.out.println("Lista com os números obtidos: " + Arrays.toString(numeros));

        // Ordena os números em ordem crescente
        int[] numerosCrescentes = numeros.clone(); // Clona o vetor original
        Arrays.sort(numerosCrescentes);
        System.out.println("Lista com os números ordenados em ordem crescente: " + Arrays.toString(numerosCrescentes));

        // Ordena os números em ordem decrescente
        Integer[] numerosDecrescentes = new Integer[numeros.length]; // Usamos Integer para permitir a ordenação
        for (int i = 0; i < numeros.length; i++) {
            numerosDecrescentes[i] = numeros[i];
        }
        Arrays.sort(numerosDecrescentes, (a, b) -> b - a); // Ordena em ordem decrescente
        System.out.println("Lista com os números ordenados em ordem decrescente: " + Arrays.toString(numerosDecrescentes));

        scanner.close();
    }
}
