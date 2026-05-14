public class Ativo {
    private String ticker;
    private double preco;
    private Setor setor;

    public Ativo(String ticker, double preco, Setor setor) {
        this.ticker = ticker;
        this.preco = preco;
        this.setor = setor;
    }

    public String getTicker() { return ticker; }
    public double getPreco() { return preco; }
    public String getNomeSetor() { return setor.getNome(); }

    @Override
    public String toString() {
        return String.format("%-6s | R$8.2f | %s", ticker, preco, setor.getNome());

    }

}
