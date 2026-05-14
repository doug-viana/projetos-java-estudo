public class Main {
    public static void main(String[] args) {
        // 1. Variável declarada, mas NÃO instanciada (null)
        Ativo acaoFavorita = null;

        System.out.println("Verificando status do sistema...");

        // 2. O check de Segurança (essencial na Administração de Sistemas)
        if (acaoFavorita != null) {
            System.out.println("Ticker: " + acaoFavorita.getTicker());
        } else {
            System.out.println("ALERTA: Nenhuma ação foi selecionada ainda!");
        }

        // 3. O MOMENTO DO ERRO (Comente o código acima e rode isso para ver o crash)
        // System.out.println(acaoFavorita.getTicker()); // Isso aqui quebra o programa!

        // 4. Agora sim, instanciando
        acaoFavorita = new Ativo();
        acaoFavorita.setTicker("ITUB4");

        System.out.println("Agora temos um ativo: " + acaoFavorita.getTicker());
    }
}