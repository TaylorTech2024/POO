public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public String verificarSituacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Situação: " + verificarSituacao());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", 8.5, 7.0);
        Aluno aluno2 = new Aluno("Bruno", 6.0, 5.5);
        Aluno aluno3 = new Aluno("Carla", 4.0, 3.5);

        aluno1.exibirInfo();
        aluno2.exibirInfo();
        aluno3.exibirInfo();
    }
}