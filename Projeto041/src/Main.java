import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Setor s1 = new Setor("Bancário");
        Setor s2 = new Setor("Energia");

        List<Ativo> carteira = new ArrayList<>();
        carteira.add(new Ativo("ITUB4", 33.00, s1));
        carteira.add(new Ativo("TAEE11", 12.00, s2));
        carteira.add(new Ativo("BBAS3", 56.00, s1));
        carteira.add(new Ativo("TRPL4", 25.00, s2));

        // --- REFORÇO DE MEMÓRIA: ORDENAÇÃO DECRESCENTE ---
        carteira.sort(Comparator.comparing(Ativo::getPreco).reversed());

        double somaTotal = 0.0;
        int contadorBancos = 0;

        System.out.println("--- RELATÓRIO DE ATIVOS ---");
        for (Ativo a : carteira) {
            System.out.println(a);

            // Lógica de Acúmulo
            somaTotal += a.getPreco();

            // Lógica de Contagem Condicional
            if (a.getNomeSetor().equalsIgnoreCase("Bancário")) {
                contadorBancos++;
            }
        }

        System.out.printf("\n--- RESUMO GERENCIAL ---");
        System.out.printf("Valor Total da Carteira: R$ %.2f%n", somaTotal);
        System.out.printf("Total de Ativos Bancários: " + contadorBancos);
    }
}