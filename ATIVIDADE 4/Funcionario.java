public class Funcionario {
    // Atributos da classe
    private String nome;
    private String cargo;
    private double salario;

    // Construtor da classe
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Métodos para recuperar os valores dos atributos
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    // Métodos para alterar os valores dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para aplicar reajuste percentual sobre o salário
    public double aplicarReajuste(double percentual) {
        double reajuste = (percentual / 100) * salario;
        salario += reajuste;
        return salario;
    }

    public static void main(String[] args) {
        // Criando um funcionário
        Funcionario funcionario = new Funcionario("João Silva", "Analista", 3000.00);

        // Exibindo os dados do funcionário
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário atual: " + funcionario.getSalario());

        // Aplicando um reajuste de 10%
        double novoSalario = funcionario.aplicarReajuste(10);
        System.out.println("Novo salário após reajuste: " + novoSalario);
    }
}
