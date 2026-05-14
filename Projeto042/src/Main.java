import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Setor s1 = new Setor("Bancário");
        Setor s2 = new Setor("Energia");

        List<Ativo> lista = new ArrayList<>();
        lista.add(new Ativo("BBAS3", 56.00, s1));
        lista.add(new Ativo("TAEE11", 12.00, s2));
        lista.add(new Ativo("ITUB4", 33.00, s1));
        lista.add(new Ativo("TRPL4", 25.00, s2));
        lista.add(new Ativo("SANB11", 29.00, s1));

        // ORDENAÇÃO POR TICKER (Memória Muscular!)
        lista.sort(Comparator.comparing(Ativo::getTicker));

        double somaBancos = 0.0;
        double somaEnergia = 0.0;

        System.out.println("--- DETALHAMENTO DA CARTEIRA ---");
        for (Ativo a : lista) {
            System.out.println(a);

            // Lógica de Separação Setorial
            if (a.getNomeSetor().equalsIgnoreCase("Bancário")) {
                somaBancos += a.getPreco();
            } else if (a.getNomeSetor().equalsIgnoreCase("Energia")) {
                somaEnergia += a.getPreco();
            }
        }

        System.out.println("\n--- EXPOSIÇÃO POR SETOR ---");
        System.out.printf("Total em Bancos : R$ %.2f%n", somaBancos);
        System.out.printf("Total em Energia: R$ %.2f%n", somaEnergia);
        System.out.printf("VALOR TOTAL     : R$ %.2f%n", (somaBancos + somaEnergia));
    }
}