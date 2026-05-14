import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- AUDITORIA DE ENTRADA RÁPIDA ---");

        try {
            // ETAPA 1: TICKER
            System.out.println("Digite o Ticker: ");
            String ticker = sc.next().toUpperCase();

            if (ticker.length() < 5) {
                throw new Exception("ERRO CRÍTICO: Ticker '" + ticker + "' é curto demais para o padrão!");
            }

            // ETAPA 2: PREÇO (Só chega aqui se o Ticker passar)
            System.out.print("Digite o Preço: ");
            double preco = sc.nextDouble();

            if (preco <= 0) {
                throw new Exception("ERRO CRÍTICO: Preço R$ " + preco + " é inválido!");
            }

            // CONCLUSÃO (Só chega aqui se NADA der erro)
            System.out.println("\nAtivo validado com sucesso: " + ticker + " | R$ " + preco);

        } catch (Exception e) {
            // O "Goleiro": ele pega a primeira bola que vier e encerra o jogo
            System.err.println("\n[RELATÓRIO DE FALHA]");
            System.err.println("Causa: " + e.getMessage());
        } finally {
            System.out.println("\n--- Fim da rotina de auditoria ---");
            sc.close();
        }
    }
}