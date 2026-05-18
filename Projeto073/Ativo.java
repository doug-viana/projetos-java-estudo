public class Ativo {
    // 1. Atributos (O que o Ativo TEM)
    public String ticker;  // Ex: PETR4, VALE3
    public String nome;
    public double precoAtual;

    public void exibirDados() {
        System.out.println("--------------------");
        System.out.println("Ticker: " + ticker);
        System.out.println("Nome: " + nome);
        System.out.printf("Preço Atual: R$ %.2f%n", precoAtual);
        System.out.println("--------------------");
    }
}
