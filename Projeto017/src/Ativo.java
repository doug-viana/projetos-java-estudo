public class Ativo {
    private String ticker;
    private double preco;
    private int quantidade;

    //CONSTRUTOR PADRÃO (Obrigatório para o nascimento do objeto)
    public Ativo(String ticker, double preco, int quantidade) {
        this.ticker = ticker;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // SOBRECARGA: Caso eu queira criar um ativo sem estoque inicial
    public Ativo(String ticker, double preco) {
        this.ticker = ticker;
        this.preco = preco;
        this.quantidade = 0; // Quantidade padrão
    }

    // Apenas Getters (Para poder ler os dados no Main)
    public String getTicker() {return ticker;}
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
}
