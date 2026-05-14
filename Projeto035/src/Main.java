import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Ativo> lista = new ArrayList<>();

        // 1. POPULANDO A CARTEIRA
        lista.add(new Ativo("PETR4", 35.0));
        lista.add(new Ativo("VALE3", 70.0));
        lista.add(new Ativo("OIBR3", 0.50)); // Alvo da limpeza por preço
        lista.add(new Ativo("VALE3", 72.0)); // Segundo lote de Vale
        lista.add(new Ativo("ITUB4", 28.0));

        System.out.println("--- CARTEIRA INICIAL ---");
        for (Ativo a : lista) System.out.println(a);

        // 2. LIMPEZA AUTOMÁTICA (PREÇO < 1.0)
        // A expressão lambda 'x -> ...' define o critério de exclusão
        lista.removeIf(x -> x.getPreco() < 1.0);
        System.out.println("\n[Auditoria] Ativos abaixo de R$ 1,00 removidos.");

        // 3. VENDA POR TICKER (Remoção por Nome)
        System.out.print("\nDigite o Ticker que deseja vender totalmente: ");
        String alvo = sc.next();

        // Remove todos os objetos cujo ticker seja igual ao digitado
        lista.removeIf(x -> x.getTicker().equalsIgnoreCase(alvo));

        System.out.println(("\n--- CARTEIRA ATUALIZADA ---"));
        if (lista.isEmpty()) {
            System.out.println("A carteira está vazia.");
        } else {
            for (Ativo a : lista) {
                System.out.println(a);
            }
        }

        sc.close();
    }
}