import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CadastroPessoas> CadastroPessoas = new ArrayList<>();

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
                    System.out.print("ID da pessoa: ");
                    String id = scanner.nextLine();
                    System.out.print("Nome da pessoa: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF da pessoa: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Data de nascimento (dd/mm/aaaa): ");
                    String dataNascimento = scanner.nextLine();

                    cadastro.add(new Pessoa(id, nome, cpf, dataNascimento));
                    System.out.println("Pessoa inserida com sucesso.");
                    break;

                case 2: // Alterar dados da pessoa
                    System.out.print("Informe o ID da pessoa para alterar: ");
                    String idParaAlterar = scanner.nextLine();
                    Pessoa pessoaParaAlterar = encontrarPessoaPorId(cadastro, idParaAlterar);

                    if (pessoaParaAlterar != null) {
                        System.out.print("Novo nome da pessoa: ");
                        pessoaParaAlterar.setNome(scanner.nextLine());
                        System.out.print("Novo CPF da pessoa: ");
                        pessoaParaAlterar.setCpf(scanner.nextLine());
                        System.out.print("Nova data de nascimento (dd/mm/aaaa): ");
                        pessoaParaAlterar.setDataNascimento(scanner.nextLine());
                        System.out.println("Dados alterados com sucesso.");
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;

                case 3: // Consultar dados da pessoa
                    System.out.print("Informe o ID da pessoa para consultar: ");
                    String idParaConsultar = scanner.nextLine();
                    Pessoa pessoaParaConsultar = encontrarPessoaPorId(cadastro, idParaConsultar);

                    if (pessoaParaConsultar != null) {
                        System.out.println(pessoaParaConsultar);
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;

                case 4: // Excluir dados de uma pessoa
                    System.out.print("Informe o ID da pessoa para excluir: ");
                    String idParaExcluir = scanner.nextLine();
                    Pessoa pessoaParaExcluir = encontrarPessoaPorId(cadastro, idParaExcluir);

                    if (pessoaParaExcluir != null) {
                        cadastro.remove(pessoaParaExcluir);
                        System.out.println("Pessoa excluída com sucesso.");
                    } else {
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

    private static Pessoa encontrarPessoaPorId(ArrayList<Pessoa> cadastro, String id) {
        for (Pessoa pessoa : cadastro) {
            if (pessoa.getId().equals(id)) {
                return pessoa;
            }
        }
        return null; // Retorna null se não encontrar
    }
}
