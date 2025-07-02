// Classe que representa um livro, estende a funcionalidade da classe Produto
public class Livro extends Produto {

    // Atributo exclusivo do livro: nome do autor
    private String autor;

    // Construtor que define os dados do livro incluindo nome, preço e autor
    public Livro(String nome, double preco, String autor) {
        super(nome, preco); // Chamada do construtor da superclasse Produto
        this.autor = autor; // Define o autor do livro
    }

    // Retorna o nome do autor do livro
    public String getAutor() {
        return autor;
    }

    // Altera o nome do autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Representação em texto do objeto Livro
    @Override
    public String toString() {
        return "Livro{" +
               "nome='" + getNome() + '\'' +
               ", preco=" + getPreco() +
               ", autor='" + autor + '\'' +
               '}';
    }
}
