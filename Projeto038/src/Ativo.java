public class Ativo {
    private String ticker;
    private double preco;
    private Setor setor; // COMPOSIÇÃO: Um objeto dentro de outro

    public Ativo(String ticker, double preco, Setor setor) {
        this.ticker = ticker;
        this.preco = preco;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return String.format("%-6s | R$ %8.2f | Setor: %s", ticker, preco, setor.getNome());
    }
}
