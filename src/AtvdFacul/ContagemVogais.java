package AtvdFacul;

import java.util.Scanner;

public class ContagemVogais {

    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = sc.nextLine().toLowerCase();

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        System.out.println("Número de vogais: " + contador);

        sc.close();
    }
}