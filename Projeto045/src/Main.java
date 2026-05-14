import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o Ticker (ex: PETR4): ");
            String ticker = sc.nextLine().trim();

            //VALIDAÇÃO DO TICKER
            if (ticker.length() < 5) {
                throw new Exception("Ticker inválido! Deve ter pelo menos 5 caracteres");
            }

            System.out.print("Digite o Preço: ");
            double preco = sc.nextDouble();

            // VALIDAÇÃO DO PREÇO
            if (preco <= 0) {
                throw new Exception("O preço deve ser maior que zero.");
            }

            // Se chegou aqui, os dados são válidos
            System.out.println("\n Ativo cadastrado com sucesso: " + ticker + " - R$ " + preco );

        } catch (Exception e) {
            // Aqui capturamos a mensagem que escrevemos lá no 'throw'
            System.err.println(" ERRO DE VALIDAÇÃO: " + e.getMessage());
        } finally {
            System.out.println("Sessão finalizada.");
            sc.close();
        }
    }
}