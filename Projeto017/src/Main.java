//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. Criando um objeto COMPLETO em uma linha só
        Ativo acao1 = new Ativo("PETR4", 38.50, 100);

        // 2. Criando um objeto usando a SOBRECARGA (sem quantidade)
        Ativo acao2 = new Ativo("VALE3", 62.10);

        System.out.println("Relatório da Carteira:");
        System.out.println("Ação 1: " + acao1.getTicker() + " - Total: " + acao1.getQuantidade());
        System.out.println("Acao 2: " + acao2.getTicker() + " - Total: " + acao2.getQuantidade());
    }
}