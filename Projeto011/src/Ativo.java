public class Ativo {
    public String ticker;
    public double preco;
    public int quantidade;

    public double valorTotalEmCarteira() {
        return preco * quantidade;
    }

    // O MÉTODX MÁGICO: Ele transforma o objeto em uma String legível
    @Override
    public String toString() {
        return "Ativo: " + ticker
                + " | Preço: R$ " + String.format("%.2f", preco)
                + " | Qtd: " + quantidade
                + " | Total: R$ " + String.format("%.2f", valorTotalEmCarteira());
    }
}
