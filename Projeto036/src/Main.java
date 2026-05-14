import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Ativo> lista = new ArrayList<>();

        lista.add(new Ativo("VALE3", 70.0));
        lista.add(new Ativo("PETR4", 35.0));
        lista.add(new Ativo("BBAS3", 55.0));
        lista.add(new Ativo("ITUB4", 28.0));

        System.out.println("--- CARTEIRA ORIGINAL ---");
        for (Ativo a : lista) System.out.println(a);

        // 1. ORDENAR POR TICKER (Alfabética)
        // Usamos o Comparator comparando as Strings dos Tickers
        lista.sort(Comparator.comparing(Ativo::getTicker));

        System.out.println("\n--- ORDENADO POR TICKER ---");
        for (Ativo a : lista) System.out.println(a);

        // 2. ORDENAR POR PREÇO (Crescente)
        lista.sort(Comparator.comparing(Ativo::getPreco));

        System.out.println("\n--- ORDENADO POR PREÇO (DO MENOR PARA O MAIOR) ---");
        for (Ativo a : lista) System.out.println(a);

        // 3. ORDENAR POR PREÇO (Decrescente)
        lista.sort(Comparator.comparing(Ativo::getPreco).reversed());

        System.out.println("\n--- ORDENADO POR PREÇO (DO MAIOR PARA O MENOR) ---");
        for (Ativo a : lista) System.out.println(a);
    }
}