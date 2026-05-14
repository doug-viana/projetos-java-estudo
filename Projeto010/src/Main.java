import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in).useLocale(Locale.US);

      Ativo acao = new Ativo();

        System.out.println("--- MONITOR DE CARTEIRA ---");

        System.out.println("Ticker do Ativo: ");
        acao.ticker = sc.next().toUpperCase();

        System.out.println("Preço unitário: R$ ");
        acao.preco = sc.nextDouble();

        System.out.println("Quantidade em mãos: ");
        acao.quantidade = sc.nextInt();

        //AQUI ESTÁ A MÁGICA: O objeto 'acao' sabe calcular o próprio valor
        double total = acao.valorTotalEmCarteira();

        System.out.println("\n--- RESUMO DA POSIÇÃO ---");
        System.out.printf("Ativo: %s%n", acao.ticker);
        System.out.printf("Total Investido: R$ %.2f%n", total);

        sc.close();

    }
}