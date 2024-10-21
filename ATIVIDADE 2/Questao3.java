/* 
NOME COMPLETO: Cauã Matheus Barbosa Guimarães
DISCIPLINA: Desenvolvimento De Aplicações
TURMA: TCTG241CNTDEV
*/

public class Questao3 {
    public static void main(String[] args) {
        System.out.println("Números entre 1 a 1000 que, quando divididos por 11, têm resto 5:");

        for (int i = 1; i <= 1000; i++) {
            if (i % 11 == 5) {
                System.out.println(i);
            }
        }
    }
}
