import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Ativo> lista = new ArrayList<>();

        lista.add(new Ativo("VALE3", 72.00));
        lista.add(new Ativo("PETR4", 38.00));
        lista.add(new Ativo("ITUB4", 33.00));
        lista.add(new Ativo("BBDC4", 15.00));
        lista.add(new Ativo("WEGE3", 42.00));

        // 1. ORDENAÇÃO DECRESCENTE (Memória Muscular!)
        lista.sort(Comparator.comparing(Ativo::getPreco).reversed());

        // 2. CÁLCULO DA MÉDIA
        double soma = 0.0;
        for (Ativo a : lista) {
            soma += a.getPreco();
        }
        double media = soma / lista.size();

        System.out.printf("--- RELATÓRIO DE AUDITORIA (Média: R$ %.2f) ---%n%n", media);

        // 3. SEGUNDO LOOP: SINALIZAÇÃO
        for (Ativo a : lista) {
            System.out.print(a);

            if (a.getPreco() > media) {
                System.out.print(" [ACIMA DA MÉDIA]");
            }
            System.out.println(); // Pular linha
        }
    }
}