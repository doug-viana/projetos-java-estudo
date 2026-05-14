public class Ativo {
    // 1. Atributos Privados (O "Cofre")
    private String ticker;
    private double preco;
    private int quantidade;

    // 2. Construtor COMPLETO (Exige tudo no "nascimento")
    public Ativo(String ticker, double preco, int quantidade) {
        this.ticker = ticker;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // 3. SOBRECARGA de Construtor (Para quando a quantidade ainda é zero)
    public Ativo(String ticker, double preco) {
        this.ticker = ticker;
        this.preco = preco;
        this.quantidade = 0; //Quantidade inicial padrão
    }

    // 4. Métodos de Comportamento (Ações do Ativo)
    public void comprar(int qtd) {
        this.quantidade += qtd; // Soma o novo aporte ao que já existia
    }

    public double valorTotalInvestido() {
        return this.preco * this.quantidade;
    }

    // 5. Getters (Para ler os dados protegidos no Main)
    public String getTicker() {
        return ticker;
    }

    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    // 6. toString (O "Cartão de Visitas" do objeto)
    @Override
    public String toString() {
        return "Ativo: " + ticker +
                " | Preço: R$ " + String.format("%.2f", preco) +
                " | Qtd: " + quantidade +
                " | Total: R$ " + String.format("%.2f", valorTotalInvestido());
    }
}

