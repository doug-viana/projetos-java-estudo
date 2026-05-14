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
    public double getPreco() {
        return preco;
    }

    // Métodx essencial para o projeto 030:
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return ticker + " - Valor atualizado: R$ " + String.format("%.2f", preco);
    }
}
