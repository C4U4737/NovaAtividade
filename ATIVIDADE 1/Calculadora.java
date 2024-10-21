/* 
NOME COMPLETO: Cauã Matheus Barbosa Guimarães
DISCIPLINA: Desenvolvimento De Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário digite uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        // Calcula a quantidade de dígitos (caracteres) na palavra
        int nDigitos = palavra.length();
        
        // A primeira letra
        char primeiraLetra = palavra.charAt(0);
        
        // A letra central (considera a letra central se a palavra tiver um número ímpar de letras)
        String letraCentral = (nDigitos % 2 != 0) ? String.valueOf(palavra.charAt(nDigitos / 2)) : "Nenhuma letra central";
        
        // A última letra
        char ultimaLetra = palavra.charAt(nDigitos - 1);
        
        // A palavra escrita ao contrário
        String palavraReversa = new StringBuilder(palavra).reverse().toString();
        
        // A palavra toda em maiúsculo
        String palavraMaiusculo = palavra.toUpperCase();
        
        // A palavra toda em minúsculo
        String palavraMinusculo = palavra.toLowerCase();
        
        // Exibe os resultados
        System.out.println("A palavra digitada foi: " + palavra);
        System.out.println("A palavra tem " + nDigitos + " dígitos.");
        System.out.println("A primeira letra é: " + primeiraLetra);
        System.out.println("A letra central da palavra é: " + letraCentral);
        System.out.println("A última letra é: " + ultimaLetra);
        System.out.println("A palavra escrita ao contrário é: " + palavraReversa);
        System.out.println("A palavra toda em maiúsculo: " + palavraMaiusculo);
        System.out.println("A palavra toda em minúsculo: " + palavraMinusculo);
        
        scanner.close();
    }
}
