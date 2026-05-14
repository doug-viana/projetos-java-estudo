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
    public double getTotalInvestido() { return preco * quantidade; }

    @Override
    public String toString() {
        return String.format("%-6s | Qtd: %3d | Total: R$ %8.2f", ticker, quantidade, getTotalInvestido());
    }
}
