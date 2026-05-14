import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Setor s1 = new Setor("Tecnologia");
        Setor s2 = new Setor("Energia");

        List<Ativo> lista = new ArrayList<>();
        lista.add(new Ativo("AAPL34", 45.0, s1));
        lista.add(new Ativo("TAEE11", 11.5, s2));
        lista.add(new Ativo("MELI34", 60.0, s1));

        // 1. ORDEM ALFABÉTICA PELO SETOR
        lista.sort(Comparator.comparing(Ativo::getNomeSetor));
        System.out.println("--- ORDENADO POR SETOR ---");
        for (Ativo a : lista) System.out.println(a);

        // 2. ORDEM DO MENOR PARA O MAIOR PREÇO
        lista.sort(Comparator.comparing(Ativo::getPreco));
        System.out.println("\n--- DO MAIOR BARATO AO MAIS CARO ---");
        for (Ativo a : lista) System.out.println(a);

        //3. ORDEM DO MAIOR PARA O MENOR PREÇO (REVERSED)
        System.out.println("\n--- DO MAIS CARO AO MAIS BARATO ---");
        for (Ativo a : lista) System.out.println(a);
    }
}