import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos ativos deseja auditar? ");
        int n = sc.nextInt();
        Ativo[] vect = new Ativo[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Limpar buffer
            System.out.println("\nAtivo #" + (i + 1));
            System.out.print("Ticker: ");
            String ticker = sc.nextLine();
            System.out.print("Preço Unitário: ");
            double preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            vect[i] = new Ativo(ticker, preco, quantidade);
        }

        // 1. Calcular o Patrimônio Total
        double patrimonioTotal = 0.0;
        for (int i = 0; i < vect.length; i++) {
            patrimonioTotal += vect[i].getValorPosicao();
        }

        // 2. Relatório de Participação
        System.out.println("\n================ RELATÓRIO DE PATRIMÔNIO ================");
        System.out.println("TICKER     |   PREÇO    |  QTD  |    TOTAL     | SHARE %");
        System.out.println("---------------------------------------------------------");

        System.out.println("---------------------------------------------------------");
        System.out.printf("PATRIMÔNIO TOTAL ACUMULADO: R$ %.2f%n", patrimonioTotal);

        sc.close();

    }

}