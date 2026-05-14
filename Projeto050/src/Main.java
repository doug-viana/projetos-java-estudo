import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Ativo> carteira = new ArrayList<>();

        System.out.print("Saldo Inicial na Corretora: R$ ");
        double saldo = sc.nextDouble();

        while (true) {
            try {
                System.out.print("\nTicker (ou 'SAIR'): ");
                String ticker = sc.next().toUpperCase();
                if (ticker.equals("SAIR"))
                    break;

                System.out.print("Preço unitário: R$ ");
                double preco = sc.nextDouble();

                System.out.print("Quantidade: ");
                int qtd = sc.nextInt();

                // --- VALIDAÇÃO DE ADMINISTRADOR (A SUA MELHORIA!) ---
                double custoTotal = preco * qtd;

                if (preco <= 0 || qtd <= 0) {
                    throw new Exception("Valores devem ser maiores que zero!");
                }
                if (custoTotal > saldo) {
                    throw new Exception("Saldo insuficiente! Faltam R$ " + (custoTotal - saldo));
                }

                // EXECUÇÃO
                saldo -= custoTotal;
                carteira.add(new Ativo(ticker, preco, qtd));
                System.out.printf("Compra realizada! Saldo restante: R$ %.2f%n", saldo);

            } catch (InputMismatchException e) {
                System.err.println("Erro: Digite apenas números!");
                sc.nextLine(); // Limpa buffer
            } catch (Exception e) {
                System.err.println("Ordem Rejeitada: " + e.getMessage());
            }
        }

        // --- RELATÓRIO DE FECHAMENTO ---
        carteira.sort(Comparator.comparing(Ativo::getTotalInvestido).reversed());

        System.out.println("\n========== POSIÇÃO CONSOLIDADA ==========");
        for (Ativo a : carteira) System.out.println(a);
        System.out.printf("Saldo em Caixa: R$ %.2f%n", saldo);
        System.out.println("========================================");

        sc.close();

    }
}