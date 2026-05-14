import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // A MÁGICA: Não precisamos dizer o tamanho [N] aqui!
        List<Ativo> carteira = new ArrayList<>();

        System.out.println("--- CADASTRO DINÂMICO---");
        String resposta;
        do {
            sc.nextLine(); // Limpar buffer
            System.out.print("Ticker do ativo: ");
            String ticker = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            // Adicionando na lista (ela cresce sozinha!)
            carteira.add(new Ativo(ticker, preco));

            System.out.print("Deseja adicionar outro? (s/n): ");
            resposta = sc.next();
        } while (resposta.equalsIgnoreCase("s"));

        System.out.println("\nCarteira atual (" + carteira.size() + "ativos):");
        for (Ativo a : carteira) {
            System.out.println(a);
        }

        // TESTE DE REMOÇÃO: Vamos remover o primeiro item
        if (!carteira.isEmpty()) {
            System.out.println("\nVendendo o primeiro ativo: " + carteira.get(0).getTicker());
            carteira.remove(0); // Remove e a lista "encolhe"

            System.out.println("\nCarteira após venda:");
            for (Ativo a : carteira) {
                System.out.println(a);
            }

            sc.close();
        }
    }
}