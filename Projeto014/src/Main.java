public class Main {
    public static void main(String[] args) {

        // Instanciando o primeiro objeto
        Ativo ativoA = new Ativo();
        ativoA.setTicker("VALE3");
        ativoA.setPreco(60.00);

        // ATENÇÃO: Aqui não criamos um 'new'.
        // Estamos apenas criando um novo nome para o mesmo endereço.
        Ativo ativoB = ativoA;

        System.out.println("--- ANTES DA MUDANÇA ---");
        System.out.println("Ticker A: " + ativoA.getTicker() + " | Preço: " + ativoA.getPreco());
        System.out.println("Ticker B: " + ativoB.getTicker() + " | Preço: " + ativoB.getPreco());

        // Mudando o valor usando a variável B
        ativoB.setPreco(75.00);

        System.out.println("\n--- DEPOIS DA MUDANÇA (Via Variável B) ---");
        // Veja que o A também mudou!
        System.out.println("Preço do Ativo A: R$ " + ativoA.getPreco());
        System.out.println("Preço do Ativo B: R$ " + ativoB.getPreco());
    }
}