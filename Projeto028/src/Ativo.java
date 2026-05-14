public class Ativo {
    private String ticker;
    private double preco;

    public Ativo(String ticker, double preco) {
        this.ticker = ticker;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return ticker + " (R$ " + preco + ")";
    }
}
