public class Ativo {
    // 1. Atributos PRIVADOS (Ninguém mexe de fora)
    private String ticker;
    private double preco;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker.toUpperCase(); // Já salva em maiúsculo por padrão!
    }
    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("ALERTA ANBIMA: Preço não pode ser zero ou negativo!");
        }
    }
    public double getPreco() {
        return preco;
    }


}
