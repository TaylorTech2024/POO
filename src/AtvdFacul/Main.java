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
                Aluno a1 = new Aluno("Herbert", 18, "ADS");
                a1.apresentar();
                a1.estudar();
                break;
            case 3:
                Calculadora calc = new Calculadora();

                System.out.println("Escolha a operação:");
                System.out.println("1 - Somar");
                System.out.println("2 - Subtrair");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.print("Digite a opção: ");
                int op = sc.nextInt();

                System.out.print("Digite o primeiro número: ");
                double n1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                double n2 = sc.nextDouble();

                switch (op) {
                    case 1:
                        System.out.println("Resultado: " + calc.somar((int)n1, (int)n2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + calc.subtrair((int)n1, (int)n2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + calc.multiplicar((int)n1, (int)n2));
                        break;
                    case 4:
                        System.out.println("Resultado: " + calc.dividir(n1, n2));
                        break;
                    default:
                        System.out.println("Operação inválida!");
                }
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