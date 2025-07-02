// Classe base que representa um produto genérico
public class Produto {

    // Atributos comuns a todos os produtos
    private String nome;
    private double preco;

    // Construtor que inicializa os atributos do produto
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método para obter o nome do produto
    public String getNome() {
        return nome;
    }

    // Define um novo nome para o produto
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o preço atual do produto
    public double getPreco() {
        return preco;
    }

    // Atualiza o valor do preço do produto
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Representação textual do objeto Produto
    @Override
    public String toString() {
        return "Produto{" +
               "nome='" + nome + '\'' +
               ", preco=" + preco +
               '}';
    }
}
