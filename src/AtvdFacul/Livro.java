package AtvdFacul;

class Livro {

    String titulo;
    String autor;
    int anoPublicacao;

    void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
   
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.anoPublicacao = 1899;

        Livro livro2 = new Livro();
        livro2.titulo = "O Hobbit";
        livro2.autor = "J.R.R. Tolkien";
        livro2.anoPublicacao = 1937;

        livro1.exibirInfo();
        livro2.exibirInfo();
    }
}
