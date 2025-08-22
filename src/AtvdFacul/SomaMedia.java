package AtvdFacul;

import java.util.Scanner;

public class SomaMedia {

    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int q = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= q; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();
            soma += num;
        }

        double media = (double) soma / q;

        System.out.println("\nResultado final:");
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        sc.close();
    }
}