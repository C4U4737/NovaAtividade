/* 
NOME COMPLETO: Cauã Matheus Barbosa Guimarães
DISCIPLINA: Desenvolvimento De Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Random;
import java.util.Scanner;

public class Questao3 {
    private static char[][] tabuleiro = new char[3][3];
    private static final char VAZIO = ' ';
    private static final char JOGADOR = 'X';
    private static final char COMPUTADOR = 'O';
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        do {
            // Inicializa o tabuleiro
            inicializaTabuleiro();
            System.out.println("Escolha o nível de dificuldade:");
            System.out.println("1. Normal");
            System.out.println("2. Difícil");
            int nivel = scanner.nextInt();

            while (true) {
                // Exibe o tabuleiro
                exibeTabuleiro();
                
                // Jogada do jogador
                jogadaJogador(scanner);
                if (verificaVencedor(JOGADOR)) {
                    exibeTabuleiro();
                    System.out.println("Você ganhou!");
                    break;
                }
                if (tabuleiroCheio()) {
                    exibeTabuleiro();
                    System.out.println("Empate!");
                    break;
                }

                // Jogada do computador
                jogadaComputador(nivel);
                if (verificaVencedor(COMPUTADOR)) {
                    exibeTabuleiro();
                    System.out.println("O computador ganhou!");
                    break;
                }
                if (tabuleiroCheio()) {
                    exibeTabuleiro();
                    System.out.println("Empate!");
                    break;
                }
            }

            // Pergunta se o jogador quer jogar novamente
            System.out.print("Deseja jogar novamente? (s/n): ");
        } while (scanner.next().equalsIgnoreCase("s"));

        scanner.close();
    }

    private static void inicializaTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = VAZIO;
            }
        }
    }

    private static void exibeTabuleiro() {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabuleiro[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----------");
        }
    }

    private static void jogadaJogador(Scanner scanner) {
        int linha, coluna;
        do {
            System.out.print("Digite a linha (0-2) e a coluna (0-2) da sua jogada (ex: 0 1): ");
            linha = scanner.nextInt();
            coluna = scanner.nextInt();
        } while (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != VAZIO);
        
        tabuleiro[linha][coluna] = JOGADOR;
    }

    private static void jogadaComputador(int nivel) {
        if (nivel == 1) {
            jogadaAleatoria();
        } else {
            jogadaDificil();
        }
    }

    private static void jogadaAleatoria() {
        Random random = new Random();
        int linha, coluna;
        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (tabuleiro[linha][coluna] != VAZIO);
        
        tabuleiro[linha][coluna] = COMPUTADOR;
    }

    private static void jogadaDificil() {
        // Verifica se o computador pode vencer
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == VAZIO) {
                    tabuleiro[i][j] = COMPUTADOR;
                    if (verificaVencedor(COMPUTADOR)) {
                        return;
                    }
                    tabuleiro[i][j] = VAZIO;
                }
            }
        }
        
        // Verifica se o jogador pode vencer e bloqueia
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == VAZIO) {
                    tabuleiro[i][j] = JOGADOR;
                    if (verificaVencedor(JOGADOR)) {
                        tabuleiro[i][j] = COMPUTADOR;
                        return;
                    }
                    tabuleiro[i][j] = VAZIO;
                }
            }
        }
        
        // Se não houver jogadas críticas, faça uma jogada aleatória
        jogadaAleatoria();
    }

    private static boolean verificaVencedor(char jogador) {
        // Verifica linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        return (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
               (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador);
    }

    private static boolean tabuleiroCheio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == VAZIO) {
                    return false;
                }
            }
        }
        return true;
    }
}
