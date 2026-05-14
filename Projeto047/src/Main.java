import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Double> precosValidos = new ArrayList<>();
        int contadorErros = 0;

        System.out.println("--- CONSOLIDADOR DE CARTEIRA V1.0 ---");

        while (true) {
            try {
                System.out.print("\nTicker (ou 'FIM'): ");
                String ticker = sc.next().toUpperCase();

                if (ticker.equals("FIM")) break;

                if (ticker.length() < 5) {
                    throw new Exception("Ticker curto demais!");
                }

                System.out.print("Preço de " + ticker + ": ");
                double preco = sc.nextDouble();

                if (preco <= 0) {
                    throw new Exception("Preço não pode ser zero ou negativo!");
                }

                precosValidos.add(preco);
                System.out.println(ticker + " adicionado ao lote.");
            } catch (Exception e) {
                contadorErros++;
                System.err.println("Registro descartado: " + e.getMessage());
                sc.nextLine(); // Limpeza de buffer
            }
        }

        // --- RELATÓRIO FINAL ---
        System.out.println("\n====================");
        System.out.println("          RESUMO DA SESSÃO          ");
        System.out.println("====================");
        System.out.println("Itens processados com sucesso: " + precosValidos.size());
        System.out.println("Itens descartados (erros)     : " + contadorErros);

        if (!precosValidos.isEmpty()) {
            double soma = 0;
            for (double p : precosValidos) soma += p;
            double media = soma / precosValidos.size();
            System.out.printf("Preço Médio do Lote: R$ %.2f%n", media);
        }

        sc.close();
    }
}