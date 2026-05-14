import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<String> errosEncontrados = new ArrayList<>();

        System.out.println("--- VALIDAÇÃO COMPLETA (ACUMULADORA) ---");

        System.out.print("Digite o ticker: ");
        String ticker = sc.next().toUpperCase();

        // Em vez de dar throw e parar, nós "anotamos" o erro
        if (ticker.length() < 5) {
            errosEncontrados.add("Ticker '" + ticker + "' curto demais.");
        }

        System.out.print("Digite o Preço: ");
        double preco = sc.nextDouble();

        if (preco <= 0) {
            errosEncontrados.add("Preço R$ " + preco + " inválido.");
        }

        // AGORA SIM: Se houver erros, nós tratamos todos de uma vez
        if (!errosEncontrados.isEmpty()) {
            System.err.println("\nA ORDEM NÃO PODE SER PROCESSADA:");
            for (String erro : errosEncontrados) {
                System.err.println("- " + erro);
            }
        } else {
            System.out.println("\nTudo perfeito! Ativo pronto para o pregão.");
        }

            sc.close();
        }
    }
