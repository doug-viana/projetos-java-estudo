import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Ativo> carteira = new ArrayList<>();

        // 1. ENTRADA DE DADOS
        carteira.add(new Ativo("PETR4", 12.5));
        carteira.add(new Ativo("VALE3", 8.2));
        carteira.add(new Ativo("ITUB4", 4.5));
        carteira.add(new Ativo("BBAS3", 9.8));
        carteira.add(new Ativo("ABEV3", 3.2));
        carteira.add(new Ativo("TAEE11", 11.0));

        System.out.println("--- CARTEIRA BRUTA ---");
        for (Ativo a : carteira) System.out.println(a);

        // 2. FILTRO (Auditoria: Remover quem paga menos de 6%)
        // Memória muscular: o 'removeIf' usa a regra inversa (quem você NÃO quer)
        carteira.removeIf(x -> x.getYield() < 6.0);

        // 3. ORDENAÇÃO (Do maior para o menor)
        // Usamos o reversed () para o ranking
        carteira.sort(Comparator.comparing(Ativo::getYield).reversed());

        System.out.println("\n--- RANKING DE DIVIDENDOS (Mínimo 6%) ---");

        // 4. EXIBINDO O TOP 3 (ou o que sobrou na lista)
        int limite = Math.min(3, carteira.size());
        for (int i = 0; i < limite; i++) {
            System.out.println((i + 1) + "° Lugar: " + carteira.get(i));
        }

        sc.close();

    }
}