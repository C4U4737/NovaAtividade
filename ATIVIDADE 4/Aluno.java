public class Aluno {
    private String nome;
    private double nota;

    // Construtor
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Métodos para recuperar e alterar o nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos para recuperar e alterar a nota
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para retornar o conceito da nota
    public String getConceito() {
        if (nota >= 90) {
            return "A";
        } else if (nota >= 80) {
            return "B";
        } else if (nota >= 70) {
            return "C";
        } else if (nota >= 60) {
            return "D";
        } else {
            return "E";
        }
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 85);
        System.out.println("Nome: " + aluno1.getNome() + 
                           ", Nota: " + aluno1.getNota() + 
                           ", Conceito: " + aluno1.getConceito());
    }
}
