/* 
NOME COMPLETO: Cauã Matheus Barbosa Guimarães
DISCIPLINA: Desenvolvimento De Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] pessoas = new String[100][3]; // Matriz para armazenar até 100 pessoas
        int contador = 0; // Contador para o número de pessoas cadastradas

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Inserir pessoa");
            System.out.println("2. Alterar dados da pessoa");
            System.out.println("3. Consultar dados da pessoa");
            System.out.println("4. Excluir dados de uma pessoa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1: // Inserir pessoa
                    if (contador < 100) {
                        System.out.print("ID da pessoa: ");
                        String id = scanner.nextLine();
                        System.out.print("Nome da pessoa: ");
                        String nome = scanner.nextLine();
                        System.out.print("Data de nascimento (dd/mm/aaaa): ");
                        String dataNascimento = scanner.nextLine();

                        pessoas[contador][0] = id;
                        pessoas[contador][1] = nome;
                        pessoas[contador][2] = dataNascimento;
                        contador++;
                        System.out.println("Pessoa inserida com sucesso.");
                    } else {
                        System.out.println("Cadastro cheio.");
                    }
                    break;

                case 2: // Alterar dados da pessoa
                    System.out.print("Informe o ID da pessoa para alterar: ");
                    String idParaAlterar = scanner.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < contador; i++) {
                        if (pessoas[i][0].equals(idParaAlterar)) {
                            System.out.print("Novo nome da pessoa: ");
                            pessoas[i][1] = scanner.nextLine();
                            System.out.print("Nova data de nascimento (dd/mm/aaaa): ");
                            pessoas[i][2] = scanner.nextLine();
                            encontrado = true;
                            System.out.println("Dados alterados com sucesso.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;

                case 3: // Consultar dados da pessoa
                    System.out.print("Informe o ID da pessoa para consultar: ");
                    String idParaConsultar = scanner.nextLine();
                    encontrado = false;

                    for (int i = 0; i < contador; i++) {
                        if (pessoas[i][0].equals(idParaConsultar)) {
                            System.out.println("ID: " + pessoas[i][0]);
                            System.out.println("Nome: " + pessoas[i][1]);
                            System.out.println("Data de Nascimento: " + pessoas[i][2]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;

                case 4: // Excluir dados de uma pessoa
                    System.out.print("Informe o ID da pessoa para excluir: ");
                    String idParaExcluir = scanner.nextLine();
                    encontrado = false;

                    for (int i = 0; i < contador; i++) {
                        if (pessoas[i][0].equals(idParaExcluir)) {
                            // Move os dados para cima
                            for (int j = i; j < contador - 1; j++) {
                                pessoas[j] = pessoas[j + 1];
                            }
                            pessoas[contador - 1] = null; // Remove a última referência
                            contador--;
                            encontrado = true;
                            System.out.println("Pessoa excluída com sucesso.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;

                case 5: // Sair
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
