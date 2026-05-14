public class Ativo {
    public String ticker;
    public double preco;
    public int quantidade;

    // CONSTRUTOR 1: Completo (Sobrecarga a)
    public Ativo(String ticker, double preco, int quantidade) {
        this.ticker = ticker;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // CONSTRUTOR 2: Apenas Ticker e Preço (Sobrecarga B)
    public Ativo(String ticker, double preco) {
        this.ticker = ticker;
        this.preco = preco;
        this.quantidade = 0; // Valor padrão inicial
    }

    @Override
    public String toString() {
        return "Ticker: " + ticker + " | Preço: " + preco + " | Qtd: " + quantidade;
    }
}
