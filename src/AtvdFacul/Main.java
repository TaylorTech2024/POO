package AtvdFacul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha qual exercício executar:");
        System.out.println("1 - Pessoa");
        System.out.println("2 - Aluno");
        System.out.println("3 - Calculadora");
        System.out.println("4 - Números Pares e Ímpares");
        System.out.println("5 - Somatório e Média");
        System.out.println("6 - Contagem de Vogais");
        System.out.print("Digite a opção: ");

        int opcao = sc.nextInt();
        sc.nextLine(); // Limpar buffer

        switch (opcao) {
            case 1:
                Pessoa p1 = new Pessoa("Herbert", 18);
                p1.apresentar();
                break;
            case 2:
                Aluno a1 = new Aluno("Andressa", 18, "ADS");
                a1.apresentar();
                a1.estudar();
                break;
            case 3:
                Calculadora calc = new Calculadora();
                System.out.println("Soma 5 + 3 = " + calc.somar(5, 3));
                System.out.println("Subtração 10 - 4 = " + calc.subtrair(10, 4));
                System.out.println("Multiplicação 7 * 2 = " + calc.multiplicar(7, 2));
                System.out.println("Divisão 20 / 4 = " + calc.dividir(20, 4));
                break;
            case 4:
                NumerosParesImpares.executar();
                break;
            case 5:
                SomaMedia.executar();
                break;
            case 6:
                ContagemVogais.executar();
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}