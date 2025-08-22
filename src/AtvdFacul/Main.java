package AtvdFacul;

public class Main {
    public static void main(String[] args) {
        // Teste Pessoa
        Pessoa p1 = new Pessoa("Herbert", 25);
        p1.apresentar();

        // Teste Aluno
        Aluno a1 = new Aluno("Andressa", 18, "Ciências Biológicas");
        a1.apresentar();
        a1.estudar();

        // Teste Calculadora
        Calculadora calc = new Calculadora();
        System.out.println("Soma 5 + 3 = " + calc.somar(5, 3));
        System.out.println("Subtração 10 - 4 = " + calc.subtrair(10, 4));
        System.out.println("Multiplicação 7 * 2 = " + calc.multiplicar(7, 2));
        System.out.println("Divisão 20 / 4 = " + calc.dividir(20, 4));

        // Teste Números Pares e Ímpares
        NumerosParesImpares.executar();
    }
}
