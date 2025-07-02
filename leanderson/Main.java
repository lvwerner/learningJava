// Classe principal responsável pela execução do programa
public class Main {
    public static void main(String[] args) {

        // Criação de uma instância da classe Camisa
        Camisa camisetaExemplo = new Camisa("Camiseta Oversized", 99.90, "GG");

        // Criação de uma instância da classe Livro
        Livro obraLiteraria = new Livro("O príncipe", 59.90, "Maquiavél");

        // Impressão das informações da camisa no console
        System.out.println(camisetaExemplo);

        // Impressão das informações do livro no console
        System.out.println(obraLiteraria);
    }
}
