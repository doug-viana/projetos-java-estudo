import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Setor s1 = new Setor("Bancário");
        Setor s2 = new Setor("Elétrico");

        List<Ativo> lista = new ArrayList<>();
        lista.add(new Ativo("ITUB4", 32.50, s1));
        lista.add(new Ativo("TRPL4", 25.10, s2));
        lista.add(new Ativo("BBDC4", 14.20, s1));
        lista.add(new Ativo("OIBR3", 0.60, s1)); // Ativo abaixo de R$ 5,00
        lista.add(new Ativo("TAEE11", 11.80, s2));

        // --- ETAPA 1: FILTRO DE AUDITORIA ---
        lista.removeIf(a -> a.getPreco() < 5.0);
        System.out.println(">>> Auditoria: Ativos abaixo de R$5,00 removidos.\n");

        // --- ETAPA 2: ORDEM ALFABÉTICA (TICKER) ---
        lista.sort(Comparator.comparing(Ativo::getTicker));
        System.out.println("--- LISTA POR TICKER ---");
        for (Ativo a : lista) System.out.println(a);

        // --- ETAPA 3: PREÇO CRESCENTE (MENOR PARA MAIOR) ---
        lista.sort(Comparator.comparing(Ativo :: getPreco));
        System.out.println("\n LISTA POR PREÇO (CRESCENTE) ---");
        for (Ativo a : lista) System.out.println(a);

        // --- ETAPA 4: PREÇO DECRESCENTE (MAIOR PARA MENOR) ---
        // Repare na combinação do comparing com o reversed
        lista.sort(Comparator.comparing(Ativo::getPreco).reversed());
        for (Ativo a : lista) System.out.println(a);
    }
}