public class Ativo {
    private String ticker;
    private double preco;
    private int quantidade;

    public Ativo(String ticker, double preco, int quantidade) {
        this.ticker = ticker;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getTicker() { return ticker; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }

    // Métodx de Negócio: Calcula quanto dinheiro tem nesse ativo
    public double getValorPosicao() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return String.format("%-10s | R$ %8.2f | Qtd: %4d | Total: R$ %10.2f", ticker, preco, quantidade, getValorPosicao());
    }
}
