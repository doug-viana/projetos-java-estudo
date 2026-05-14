public class Ativo {
    private String ticker;
    private double preco;

    public Ativo(String ticker, double preco) {
        this.ticker = ticker;
        this.preco = preco;
    }

    public String getTicker() {
        return ticker;
    }

    @Override
    public String toString() {
        return ticker + " | Preço: R$ " + String.format("%.2f", preco);
    }
}
