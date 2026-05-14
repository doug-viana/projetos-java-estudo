public class Main {
    public static void main(String[] args) {
        Ativo acao = new Ativo();

        // acao.preco = 10.0; // ERRO! Isso nem compila mais. O cofre está trancado.

        // O jeito certo agora é via métodos:
        acao.setTicker("petr4");
        acao.setPreco(38.50);

        System.out.println("Ativo: " + acao.getTicker());
        System.out.println("Preço: R$ " + acao.getPreco());

        // Testando a segurança:
        acao.setPreco(-5.00); // Vai disparar o nosso alerta!
    }
}