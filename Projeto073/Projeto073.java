public class Projeto073 {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Cadastro de Ativos - ANBIMA ===");

        Ativo ativo1 = new Ativo();
        ativo1.ticker = "PETR4";
        ativo1.nome = "Petróleo Brasileiro S.A.";
        ativo1.precoAtual = 38.40;

        Ativo ativo2 = new Ativo();
        ativo2.ticker = "VALE3";
        ativo2.nome = "Vale S.A.";
        ativo2.precoAtual = 62.15;

        System.out.println("\nExibindo os ativos cadastros no sistema:");
        ativo1.exibirDados();
        ativo2.exibirDados();
    }
}
