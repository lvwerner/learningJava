// Classe que representa uma camisa, herda os atributos e comportamentos de Produto
public class Camisa extends Produto {

    // Propriedade específica da camisa: tamanho
    private String tamanho;

    // Construtor para inicializar os dados da camisa
    public Camisa(String nome, double preco, String tamanho) {
        super(nome, preco); // Inicializa os atributos herdados de Produto
        this.tamanho = tamanho; // Define o tamanho da camisa
    }

    // Recupera o tamanho da camisa
    public String getTamanho() {
        return tamanho;
    }

    // Atualiza o valor da propriedade 'tamanho'
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    // Sobrescreve o método toString para fornecer uma descrição da camisa
    @Override
    public String toString() {
        return "Camisa{" +
               "nome='" + getNome() + '\'' +
               ", preco=" + getPreco() +
               ", tamanho='" + tamanho + '\'' +
               '}';
    }
}
