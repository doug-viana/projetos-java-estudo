import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<String> carteira = new ArrayList<>();

        System.out.println("--- SISTEMA DE CADASTRO CONTÍNUO ---");
        System.out.println("(Digite 'SAIR' no ticker para encerrar)\n");

        while (true) {
            try {
                System.out.print("Ticker do Ativo: ");
                String ticker = sc.next().toUpperCase();

                if (ticker.equals("SAIR")) {
                    break; // Sai do loop while
                }

                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                // Validação customizada
                if (preco <= 0) {
                    throw new Exception("Preco inválido! Tente novamente.");
                }

                carteira.add(ticker + " - R$ " + preco);
                System.out.println(" Adicionado!");
            } catch (Exception e) {
                System.err.println(" Erro no cadastro: " + e.getMessage());
                sc.nextLine();
            }
            System.out.println("----------------------------------------");
        }

        System.out.println("\n--- CARTEIRA FINALIZADA ---");
        for (String item : carteira) {
            System.out.println(item);
        }

        sc.close();

    }
}